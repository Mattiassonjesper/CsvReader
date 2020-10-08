package mattiassonjesper;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserInterface extends JFrame implements ActionListener {
	private Object[][] data;
	private String[] columnNames = { "Game", "Maker", "Created", "Price", "Country", "Console" };
	private DefaultTableModel tableModel;
	private JTable table;
	private GamesList myList;

	public UserInterface(String title) {
		super(title);
		setBounds(10, 10, 500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myList = new GamesList();
		myList.readFromCSV("games.csv");
		data = myList.convert2Data();
		tableModel = new DefaultTableModel(data, columnNames);
		table = new JTable(tableModel);
		table.setAutoCreateRowSorter(true);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(480, 380));
		JPanel panel = new JPanel();
		panel.add(scrollPane);
		add(panel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent ae) {

	}

}
