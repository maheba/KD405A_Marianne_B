import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ScrollPaneConstants;
import javax.swing.DropMode;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private final JScrollPane scrollPane = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 0, 822, 498);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Century Gothic", Font.PLAIN, 22));
		scrollPane.setViewportView(textArea);
	
		House House1 = new House(2009, 190);
		House House2 = new House(1971, 211);
		House House3 = new House(1905, 145);

		System.out.println("Uppgift 1.2");
		System.out.println("Hus 1:  Byggår: " + House1.getYearBuilt() + "   Kvm: " + House1.getSize());
		System.out.println("Hus 2:  Byggår: " + House2.getYearBuilt() + "   Kvm: " + House2.getSize());
		System.out.println("Hus 3:  Byggår: " + House3.getYearBuilt() + "   Kvm: " + House3.getSize());
		
		textArea.setText(" Uppgift 1.2");
		textArea.append("\n Hus 1:  Byggår: " + House1.getYearBuilt() + "   Kvm: " + House1.getSize());
		textArea.append("\n Hus 2:  Byggår: " + House2.getYearBuilt() + "   Kvm: " + House2.getSize());
		textArea.append("\n Hus 3:  Byggår: " + House3.getYearBuilt() + "   Kvm: " + House3.getSize());
		
		House HouseArray [] = new House [10];
		HouseArray [0] = new House(2009, 190);
		HouseArray [1] = new House(2003, 110);
		HouseArray [2] = new House(2003, 120);
		HouseArray [3] = new House(2004, 110);
		HouseArray [4] = new House(2004, 140);
		HouseArray [5] = new House(2005, 160);
		HouseArray [6] = new House(2005, 100);
		HouseArray [7] = new House(2006, 110);
		HouseArray [8] = new House(2006, 130);
		HouseArray [9] = new House(2007, 140);
		
		textArea.append("\n Uppgift 1.3");
		for (int i=0; i<10; i++){
			textArea.append("\n Hus " + (i+1) + ":  Byggår: " + HouseArray[i].getYearBuilt() + "   Kvm: " + HouseArray[i].getSize());
		}
		
		Random rand = new Random();
		
		ArrayList<House> houseList = new ArrayList<House>();
		for (int i=0; i<100; i++) {
			houseList.add(new House(rand.nextInt(300)+1750, rand.nextInt(1000)+5));
		}
		
		textArea.append("\n Uppgift 1.4");
		for (int i=0; i<100; i++){
			textArea.append("\n Hus " + (i+1) + ":  Byggår: " + houseList.get(i).getYearBuilt() + "   Kvm: " + houseList.get(i).getSize());
		}
		
	}
}
