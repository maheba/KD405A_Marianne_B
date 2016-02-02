package se.mah.KD405A;

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

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BikeStoreGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeStoreGUI frame = new BikeStoreGUI();
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
	public BikeStoreGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 695);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(344, 136, 385, 487);
		contentPane.add(scrollPane);
		
		JTextArea txtrTillgngligaCyklar = new JTextArea();
		txtrTillgngligaCyklar.setEditable(false);
		txtrTillgngligaCyklar.setFont(new Font("Arial", Font.PLAIN, 16));
		txtrTillgngligaCyklar.setText("Tillg\u00E4ngliga cyklar: \n");
		scrollPane.setViewportView(txtrTillgngligaCyklar);
		
		BikeStore cykelshop = new BikeStore();
		
		Random rand = new Random();
		
		for (int i=0; i<20; i++) {
			cykelshop.addBike(Constants.COLORARRAY[rand.nextInt(5)], rand.nextInt(20)+8, rand.nextInt(30000));
			//cykelshop.addBike("Vit", 26, 3000);
		}
		txtrTillgngligaCyklar.append(cykelshop.getAllBikes());
		
		
		JLabel lblNyCykel = new JLabel("Ny cykel:");
		lblNyCykel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNyCykel.setBounds(29, 138, 255, 52);
		contentPane.add(lblNyCykel);
		
		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFrg.setBounds(29, 206, 69, 20);
		contentPane.add(lblFrg);
		
		JLabel lblStorlek = new JLabel("Storlek:");
		lblStorlek.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStorlek.setBounds(29, 257, 69, 20);
		contentPane.add(lblStorlek);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPris.setBounds(29, 314, 69, 20);
		contentPane.add(lblPris);
		
		textField = new JTextField();
		textField.setBounds(125, 206, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 255, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 312, 146, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCykelshop = new JLabel("Cykelshop");
		lblCykelshop.setFont(new Font("Tahoma", Font.PLAIN, 61));
		lblCykelshop.setBounds(15, 26, 714, 94);
		contentPane.add(lblCykelshop);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int iSize = Integer.parseInt(textField_1.getText().toString());
				int iPrice = Integer.parseInt(textField_2.getText().toString());
				//Bike b = new Bike (textField.getText(), iSize, iPrice);
				cykelshop.addBike(textField.getText().toString(), iSize, iPrice);
				txtrTillgngligaCyklar.setText(cykelshop.getAllBikes());
			}
		});
		btnLggTill.setBounds(156, 388, 115, 29);
		contentPane.add(btnLggTill);
		
		
	}

}
