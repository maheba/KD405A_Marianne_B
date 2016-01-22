package se.mah.KD405A;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTextField txtNamn;
	private JTextField txtLisaAndersson;
	private JTextField txtPersonnr;
	private JTextField txtAdress;
	private JTextField textField;
	private JTextField txtStorgatan;
	private JTextField txtMalm;
	private JTextField txtTel;
	private JTextField txtEpost;
	private JTextField textField_1;
	private JTextField txtLisaanderssonsee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 818, 537);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnNewMenu = new JMenu("Medlem");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnNewMenu.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnNewMenu.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 801, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 800, 100);
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/ImgPack/logotu.png")));
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Gymets", TitledBorder.LEFT, TitledBorder.BELOW_TOP, null, new Color(255, 0, 0)), "medlemmar", TitledBorder.LEFT, TitledBorder.BELOW_TOP, null, new Color(255, 0, 0)));
		scrollPane.setForeground(Color.RED);
		scrollPane.setFont(new Font("Hobo Std", Font.BOLD, 18));
		scrollPane.setBounds(15, 110, 151, 340);
		scrollPane.setViewportBorder(null);
		scrollPane.setToolTipText("");
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{"Lisa Andersson"},
				{"Peter Andreasson"},
				{"Jan Brodin"},
				{"Sanna Carlsson"},
				{"Patrik Carlsson"},
				{"Per Dynga"},
				{"Erik Ericsson"},
				{"Anna Eriksson"},
				{"Staffan Friberg"},
				{"Stefan Gustavsson"},
				{"Agneta Gurlin"},
				{"Stina Hansson"},
				{"Sofia H\u00E5kansson"},
				{"Nanne Isaksson"},
				{"Manne J\u00F6nsson"},
				{"Mikeal J\u00F6nsson"},
				{"Eva Karlsson"},
				{"G\u00F6ran Karlsson"},
				{"Sven Larsson"},
				{"G\u00F6ran Larsson"},
				{"Kerstin Moberg"},
				{"Gunilla Nilsson"},
				{"Jenny Nil\u00E9n"},
				{null},
			},
			new String[] {
				""
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(150);
		table_1.getColumnModel().getColumn(0).setMinWidth(20);
		table_1.getColumnModel().getColumn(0).setMaxWidth(150);
		scrollPane.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.RED));
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(184, 110, 597, 340);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		txtNamn = new JTextField();
		txtNamn.setEditable(false);
		txtNamn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNamn.setForeground(Color.RED);
		txtNamn.setText("Namn:");
		txtNamn.setBounds(15, 16, 86, 26);
		panel_1.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtLisaAndersson = new JTextField();
		txtLisaAndersson.setFont(new Font("Hobo Std", Font.BOLD, 20));
		txtLisaAndersson.setForeground(Color.RED);
		txtLisaAndersson.setText("Lisa Andersson");
		txtLisaAndersson.setBounds(100, 16, 184, 26);
		panel_1.add(txtLisaAndersson);
		txtLisaAndersson.setColumns(10);
		
		txtPersonnr = new JTextField();
		txtPersonnr.setEditable(false);
		txtPersonnr.setText("Personnr:");
		txtPersonnr.setForeground(Color.RED);
		txtPersonnr.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPersonnr.setColumns(10);
		txtPersonnr.setBounds(15, 65, 86, 26);
		panel_1.add(txtPersonnr);
		
		txtAdress = new JTextField();
		txtAdress.setEditable(false);
		txtAdress.setText("Adress:");
		txtAdress.setForeground(Color.RED);
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAdress.setColumns(10);
		txtAdress.setBounds(15, 107, 86, 26);
		panel_1.add(txtAdress);
		
		textField = new JTextField();
		textField.setText("800317-5768");
		textField.setForeground(Color.RED);
		textField.setFont(new Font("Hobo Std", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(100, 66, 184, 26);
		panel_1.add(textField);
		
		txtStorgatan = new JTextField();
		txtStorgatan.setText("Storgatan 12");
		txtStorgatan.setForeground(Color.RED);
		txtStorgatan.setFont(new Font("Hobo Std", Font.PLAIN, 16));
		txtStorgatan.setColumns(10);
		txtStorgatan.setBounds(100, 108, 184, 26);
		panel_1.add(txtStorgatan);
		
		txtMalm = new JTextField();
		txtMalm.setText("211 57 Malm\u00F6");
		txtMalm.setForeground(Color.RED);
		txtMalm.setFont(new Font("Hobo Std", Font.PLAIN, 16));
		txtMalm.setColumns(10);
		txtMalm.setBounds(100, 133, 184, 26);
		panel_1.add(txtMalm);
		
		txtTel = new JTextField();
		txtTel.setEditable(false);
		txtTel.setText("Tel:");
		txtTel.setForeground(Color.RED);
		txtTel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTel.setColumns(10);
		txtTel.setBounds(15, 175, 86, 26);
		panel_1.add(txtTel);
		
		txtEpost = new JTextField();
		txtEpost.setEditable(false);
		txtEpost.setText("E-post:");
		txtEpost.setForeground(Color.RED);
		txtEpost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtEpost.setColumns(10);
		txtEpost.setBounds(15, 217, 86, 26);
		panel_1.add(txtEpost);
		
		textField_1 = new JTextField();
		textField_1.setText("0707-12 34 56");
		textField_1.setForeground(Color.RED);
		textField_1.setFont(new Font("Hobo Std", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(100, 175, 184, 26);
		panel_1.add(textField_1);
		
		txtLisaanderssonsee = new JTextField();
		txtLisaanderssonsee.setText("lisa@andersson.see");
		txtLisaanderssonsee.setForeground(Color.RED);
		txtLisaanderssonsee.setFont(new Font("Hobo Std", Font.PLAIN, 16));
		txtLisaanderssonsee.setColumns(10);
		txtLisaanderssonsee.setBounds(100, 217, 184, 26);
		panel_1.add(txtLisaanderssonsee);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Main.class.getResource("/ImgPack/Face_female_sm.jpg")));
		label.setBounds(311, 20, 271, 304);
		panel_1.add(label);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.setBounds(100, 295, 115, 29);
		panel_1.add(btnSpara);
	}
}
