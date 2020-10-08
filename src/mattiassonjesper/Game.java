package mattiassonjesper;

public class Game {
	private String Game;
	private String Maker;
	private int Created;
	private double price;
	private String country;
	private String console;

	public Game(String g, String m, int c, double pr, String co, String con) {
		setGame(g.trim());
		setMaker(m.trim());
		setCreated(c);
		setPrice(pr);
		setCountry(co);
		setConsole(con);
	}

	public String getGame() {
		return Game;
	}

	public void setGame(String game) {
		this.Game = game;
	}

	public String getMaker() {
		return Maker;
	}

	public void setMaker(String maker) {
		this.Maker = maker;
	}

	public int getCreated() {
		return Created;
	}

	public void setCreated(int c) {
		this.Created = c;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

}
