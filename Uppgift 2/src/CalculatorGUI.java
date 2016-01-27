import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	Calculator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setResizable(false);
		setTitle("Kalkylator\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 270, 375);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 0, 0));
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		myCalculator = new Calculator();
		
		JButton button = new JButton("1");
		button.setBackground(new Color(255, 228, 225));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
				myCalculator.numberButtonPressed(1);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 11));
		button.setForeground(new Color(102, 51, 0));
		button.setBounds(15, 16, 41, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("2");
		button_1.setBackground(new Color(255, 228, 225));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				myCalculator.numberButtonPressed(2);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_1.setForeground(new Color(102, 51, 0));
		button_1.setBounds(71, 16, 41, 29);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setBackground(new Color(255, 228, 225));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
				myCalculator.numberButtonPressed(3);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_2.setForeground(new Color(102, 51, 0));
		button_2.setBounds(127, 16, 41, 29);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("4");
		button_3.setBackground(new Color(255, 228, 225));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
				myCalculator.numberButtonPressed(4);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_3.setForeground(new Color(102, 51, 0));
		button_3.setBounds(15, 61, 41, 29);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("5");
		button_4.setBackground(new Color(255, 228, 225));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
				myCalculator.numberButtonPressed(5);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_4.setForeground(new Color(102, 51, 0));
		button_4.setBounds(71, 61, 41, 29);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("6");
		button_5.setBackground(new Color(255, 228, 225));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
				myCalculator.numberButtonPressed(6);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_5.setForeground(new Color(102, 51, 0));
		button_5.setBounds(127, 61, 41, 29);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("7");
		button_6.setBackground(new Color(255, 228, 225));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
				myCalculator.numberButtonPressed(7);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_6.setForeground(new Color(102, 51, 0));
		button_6.setBounds(15, 106, 41, 29);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.setBackground(new Color(255, 228, 225));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
				myCalculator.numberButtonPressed(8);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_7.setForeground(new Color(102, 51, 0));
		button_7.setBounds(71, 106, 41, 29);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.setBackground(new Color(255, 228, 225));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
				myCalculator.numberButtonPressed(9);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_8.setForeground(new Color(102, 51, 0));
		button_8.setBounds(127, 106, 41, 29);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.setBackground(new Color(255, 239, 213));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "+");
				myCalculator.plus();
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 28));
		button_9.setForeground(new Color(102, 51, 0));
		button_9.setBounds(183, 16, 54, 29);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("\u2013");
		button_10.setBackground(new Color(255, 239, 213));
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "–");
				myCalculator.minus();
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 28));
		button_10.setForeground(new Color(102, 51, 0));
		button_10.setBounds(183, 61, 54, 29);
		contentPane.add(button_10);
		
		JButton btnX = new JButton("*");
		btnX.setBackground(new Color(255, 239, 213));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "*");
				myCalculator.mult();
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnX.setForeground(new Color(102, 51, 0));
		btnX.setBounds(183, 106, 54, 29);
		contentPane.add(btnX);
		
		JButton button_11 = new JButton("=");
		button_11.setBackground(new Color(255, 239, 213));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCalculator.equals();
				int i = myCalculator.getResult();
				textField.setText(String.valueOf(i));
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 28));
		button_11.setForeground(new Color(102, 51, 0));
		button_11.setBounds(15, 198, 153, 29);
		contentPane.add(button_11);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setForeground(new Color(153, 0, 51));
		textField.setBackground(Color.WHITE);
		textField.setEditable(false);
		textField.setBounds(15, 243, 222, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				myCalculator.clear();
			}
		});
		btnC.setForeground(new Color(102, 51, 0));
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnC.setBackground(new Color(255, 239, 213));
		btnC.setBounds(183, 198, 54, 29);
		contentPane.add(btnC);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
				myCalculator.numberButtonPressed(0);
			}
		});
		button_12.setForeground(new Color(102, 51, 0));
		button_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_12.setBackground(new Color(255, 228, 225));
		button_12.setBounds(71, 153, 41, 29);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("/");
		button_13.setEnabled(false);
		button_13.setForeground(new Color(102, 51, 0));
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 21));
		button_13.setBackground(Color.LIGHT_GRAY);
		button_13.setBounds(183, 153, 54, 29);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton(",");
		button_14.setEnabled(false);
		button_14.setForeground(new Color(102, 51, 0));
		button_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		button_14.setBackground(Color.LIGHT_GRAY);
		button_14.setBounds(127, 153, 41, 29);
		contentPane.add(button_14);
	}

}
