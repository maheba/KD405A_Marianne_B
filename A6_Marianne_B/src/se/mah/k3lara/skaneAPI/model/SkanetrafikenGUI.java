package se.mah.k3lara.skaneAPI.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;

public class SkanetrafikenGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtHallplatser;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextArea txtResultathallplatser;
	private JTextArea txtResa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SkanetrafikenGUI frame = new SkanetrafikenGUI();
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
	public SkanetrafikenGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SkanetrafikenGUI.class.getResource("/UML/icon-train.png")));
		setTitle("Sk\u00E5netrafiken s\u00F6k");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel4_sokHallplatser = new JPanel();
		panel4_sokHallplatser.setBorder(null);
		panel4_sokHallplatser.setBounds(0, 0, 754, 193);
		contentPane.add(panel4_sokHallplatser);
		panel4_sokHallplatser.setLayout(null);
		
		txtHallplatser = new JTextField();
		txtHallplatser.setForeground(Color.BLACK);
		txtHallplatser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHallplatser.setBounds(15, 16, 503, 38);
		panel4_sokHallplatser.add(txtHallplatser);
		txtHallplatser.setColumns(10);
		
		JButton btnHallplatser = new JButton("S\u00F6k h\u00E5llplatser");
		btnHallplatser.setForeground(Color.RED);
		btnHallplatser.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHallplatser.setBounds(533, 16, 206, 38);
		panel4_sokHallplatser.add(btnHallplatser);
		
		JScrollPane scrollHallplatser = new JScrollPane();
		scrollHallplatser.setBounds(15, 70, 724, 108);
		panel4_sokHallplatser.add(scrollHallplatser);
		
		txtResultathallplatser = new JTextArea();
		txtResultathallplatser.setFont(new Font("Arial", Font.PLAIN, 16));
		txtResultathallplatser.setEditable(false);
		scrollHallplatser.setViewportView(txtResultathallplatser);
		
		JPanel panel5_sokResa = new JPanel();
		panel5_sokResa.setBorder(null);
		panel5_sokResa.setBounds(0, 197, 754, 224);
		contentPane.add(panel5_sokResa);
		panel5_sokResa.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 113, 724, 111);
		panel5_sokResa.add(scrollPane);
		
		txtResa = new JTextArea();
		txtResa.setFont(new Font("Arial", Font.PLAIN, 16));
		txtResa.setEditable(false);
		scrollPane.setViewportView(txtResa);
		
		txtFrom = new JTextField();
		txtFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtFrom.setForeground(Color.BLACK);
		txtFrom.setBounds(15, 57, 270, 40);
		panel5_sokResa.add(txtFrom);
		txtFrom.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTo.setBounds(300, 57, 270, 40);
		panel5_sokResa.add(txtTo);
		txtTo.setColumns(10);
		
		JButton btnSkResa = new JButton("S\u00F6k resa");
		btnSkResa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSkResa.setForeground(Color.RED);
		btnSkResa.setBounds(590, 32, 149, 65);
		panel5_sokResa.add(btnSkResa);
		
		JLabel lblFrn = new JLabel(" Fr\u00E5n");
		lblFrn.setForeground(Color.RED);
		lblFrn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFrn.setBounds(15, 32, 69, 20);
		panel5_sokResa.add(lblFrn);
		
		JLabel lblTill = new JLabel(" Till");
		lblTill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTill.setForeground(Color.RED);
		lblTill.setBounds(300, 32, 69, 20);
		panel5_sokResa.add(lblTill);
		
		btnHallplatser.addActionListener(this);
		btnSkResa.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "Sök hållplatser") {
			txtResultathallplatser.setText(" Söker...");
			InnerThread1 it = new InnerThread1();
		}
		if (e.getActionCommand() == "Sök resa") {
			txtResa.setText(" Söker...");
			InnerThread2 it = new InnerThread2();
		}
	}
	/**Uppgift 6*/
	public class InnerThread1 {
		//Constructor
		public InnerThread1() {
			SearchThread myThread = new SearchThread();
			myThread.start();
		}
		//Inner class
		private class SearchThread extends Thread {
			//This method is called when the thread starts
			@Override
			public void run() {
				//try {
				//Thread.sleep(10000);
				ArrayList<Station> searchStations = new ArrayList<Station>(); 
				searchStations.addAll(Parser.getStationsFromURL(txtHallplatser.getText()));
				txtResultathallplatser.setText("");
				for (Station s: searchStations){
					txtResultathallplatser.append(" " + s.getStationName() +", nummer: " + s.getStationNbr() +". Latitud: " + s.getLatitude() + ", longitud: " + s.getLongitude() + ".\n");
				}
				//} catch (InterruptedException e) {}
			}
		}
	}
	public class InnerThread2 {
		//Constructor
		public InnerThread2() {
			SearchThread myThread = new SearchThread();
			myThread.start();
		}
		//Inner class
		private class SearchThread extends Thread {
			//This method is called when the thread starts
			@Override
			public void run() {
				//try {
				//Thread.sleep(10000);
				String searchURL = Constants.getURL(txtFrom.getText(),txtTo.getText(),1);
				//System.out.println(searchURL);
				Journeys journeys = Parser.getJourneys(searchURL);
				for (Journey journey : journeys.getJourneys()) {
					//Har lagt in en break i Parser-klassen för att få fram startstationen på första resan vid resa med byte!!!
					txtResa.setText(" " + journey.getStartStation()+" - " + journey.getEndStation() + "\n" + "\n");
					String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
					txtResa.append(" Avgår " + time + " Det är om " + journey.getTimeToDeparture() + " minuter. Och är " + journey.getDepTimeDeviation()+" min sent."	
					+ "\n Du anländer" + journey.getArrDateTime().get(Calendar.HOUR_OF_DAY) + journey.getArrDateTime().get(Calendar.MINUTE) + " och det avviker " + journey.getArrTimeDeviation() + " från tidtabellen." 
					+ "\n Resan har " + journey.getNoOfChanges() + " byten."
					+ "\n Första linjen på resan är " + journey.getLineOnFirstJourney() + "."
					+ "\n Resan tar " + journey.getTravelMinutes() + " minuter."
					+ "\n Resan sträcker sig över " + journey.getNoOfZones() + " zoner."
					+ "\n Resan sker med " + journey.getLineTypeName() + "."
					);
				} 
				//} catch (InterruptedException e) {}
			}
		}
	}
}
