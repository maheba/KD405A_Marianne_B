package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHumanname;
	private JTextField txtDogname;
	
	Human h = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(HumanDogGUI.class.getResource("/se/mah/KD405A/hund.jpg")));
		setTitle("Humans and Dogs");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setForeground(new Color(219, 112, 147));
		lblHumansAndDogs.setFont(new Font("Tekton Pro Ext", Font.PLAIN, 34));
		lblHumansAndDogs.setBounds(60, 16, 331, 81);
		contentPane.add(lblHumansAndDogs);
		
		txtHumanname = new JTextField();
		txtHumanname.setBounds(60, 94, 146, 26);
		contentPane.add(txtHumanname);
		txtHumanname.setColumns(10);
		
		txtDogname = new JTextField();
		txtDogname.setBounds(60, 139, 146, 26);
		contentPane.add(txtDogname);
		txtDogname.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setViewportBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(64, 64, 64)), "ErrorMessage", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		scrollPane.setBounds(60, 334, 330, 70);
		contentPane.add(scrollPane);
				
		JTextArea txtrErrormessage = new JTextArea();
		txtrErrormessage.setForeground(new Color(199, 21, 133));
		txtrErrormessage.setBackground(SystemColor.control);
		txtrErrormessage.setEditable(false);
		scrollPane.setViewportView(txtrErrormessage);
		
		JScrollPane scrollPaneInfo = new JScrollPane();
		scrollPaneInfo.setBorder(null);
		scrollPaneInfo.setViewportBorder(new TitledBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255, 175, 175)), "Info", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		scrollPaneInfo.setBounds(60, 240, 330, 70);
		contentPane.add(scrollPaneInfo);
		
		JTextArea txtrInfo = new JTextArea();
		txtrInfo.setEditable(false);
		scrollPaneInfo.setViewportView(txtrInfo);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Human h;
				if (txtHumanname.getText().length() >= 3) {
					h = new Human(txtHumanname.getText());
					txtrErrormessage.setText("");
					//System.out.println(h.getName());
				} else {
					txtrErrormessage.setText("Namnet behöver minst tre bokstäver");
				}	
			}
		});
		btnNewHuman.setBackground(new Color(255, 228, 225));
		btnNewHuman.setBounds(242, 93, 149, 29);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (h != null) {
					Dog d = new Dog(txtDogname.getText());
					txtrErrormessage.setText("");
					h.buyDog(d);
					//System.out.println(txtDogname.getText());
				} else {
					txtrErrormessage.setText("Hunden måste ha en ägare");
				}	
			}
		});
		btnBuyDog.setBackground(new Color(255, 228, 225));
		btnBuyDog.setBounds(242, 138, 149, 29);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrInfo.setText(h.getInfo());
			}
		});
		btnPrintInfo.setBackground(new Color(255, 228, 225));
		btnPrintInfo.setBounds(242, 183, 149, 29);
		contentPane.add(btnPrintInfo);
		
		
		


		
		JLabel bgrImg = new JLabel("");
		bgrImg.setIcon(new ImageIcon(HumanDogGUI.class.getResource("/se/mah/KD405A/hund.jpg")));
		bgrImg.setBounds(0, 0, 474, 466);
		contentPane.add(bgrImg);
	}
}
