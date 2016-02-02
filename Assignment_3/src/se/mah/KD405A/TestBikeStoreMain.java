package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TestBikeStoreMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestBikeStoreMain frame = new TestBikeStoreMain();
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
	public TestBikeStoreMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		BikeStore cykelshop = new BikeStore();
		
		Random rand = new Random();
		
		for (int i=0; i<20; i++) {
			cykelshop.addBike(Constants.COLORARRAY[rand.nextInt(5)].toString(), rand.nextInt(20)+8, rand.nextInt(30000));
			//cykelshop.addBike("Vit", 26, 3000);
		
		}
		System.out.println(cykelshop.getAllBikes());
	}
}
