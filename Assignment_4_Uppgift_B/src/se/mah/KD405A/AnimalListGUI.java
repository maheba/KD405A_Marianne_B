package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;

public class AnimalListGUI extends JFrame {

	private JPanel contentPane;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalListGUI frame = new AnimalListGUI();
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
	public AnimalListGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(null, "Animallist", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(28, 29, 600, 400);
		contentPane.add(scrollPane);
		
		JTextArea txtrDjurlistan = new JTextArea();
		txtrDjurlistan.setEditable(false);
		scrollPane.setViewportView(txtrDjurlistan);
		
		ArrayList<Animal> myAnimals  = new ArrayList<Animal>();
		
		myAnimals.add(new Snake ("python regius", false));
		myAnimals.add(new Snake ("snapius", true));
		myAnimals.add(new Dog ("hundius", 4, false, "FiaLisa"));
		myAnimals.add(new Dog ("hundius", 0, false, "Fido"));
		myAnimals.add(new Dog ("dogius", 5, false));
		myAnimals.add(new Cat ("kattius", 2, 9));
		myAnimals.add(new Cat ("kattius", 0, 5));
		
		for (int i=0; i<myAnimals.size(); i++){
			txtrDjurlistan.append("\n" + myAnimals.get(i).getInfo());
		}
		
		}		
	}

