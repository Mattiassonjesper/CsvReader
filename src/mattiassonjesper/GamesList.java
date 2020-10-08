package mattiassonjesper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GamesList {
	private ArrayList<Game> gamelist;

	public GamesList() {
		gamelist = new ArrayList<Game>();
	}

	public void add(Game gb) {
		gamelist.add(gb);
	}

	public void readFromCSV(String filename) {
		File file = new File(filename);
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		BufferedReader infile = new BufferedReader(reader);
		String line = "";
		try {
			boolean done = false;
			while (!done) {
				line = infile.readLine();
				if (line == null) {
					done = true;
				} else {
					String[] tokens = line.trim().split(",");
					String game = tokens[0].trim();
					String maker = tokens[1].trim();
					int created = Integer.parseInt(tokens[2].trim());
					double price = Double.parseDouble(tokens[3].trim());
					String country = tokens[4].trim();
					String console = tokens[5].trim();
					Game gl = new Game(game, maker, created, price, country, console);
					gamelist.add(gl);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public Object[][] convert2Data() {
		Object[][] data = new Object[gamelist.size()][6];
		for (int i = 0; i < gamelist.size(); i++) {
			data[i][0] = gamelist.get(i).getGame();
			data[i][1] = gamelist.get(i).getMaker();
			data[i][2] = gamelist.get(i).getCreated();
			data[i][3] = gamelist.get(i).getPrice();
			data[i][4] = gamelist.get(i).getCountry();
			data[i][5] = gamelist.get(i).getConsole();
		}
		return data;
	}
}
