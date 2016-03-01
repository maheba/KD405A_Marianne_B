import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class TryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PixelController c = PixelController.getInstance(Screen.ASSIGNMENT_7); //MEDEA_1   ASSIGNMENT_7
		//Wait until connected with
		int count = 0;
		while (c.isConnected() == false && count <20) {
			//Send your pixels with fx:
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ej uppkopplad");
			count ++;
		}
		if (c.isConnected()) {
			//c.setPixel(50,50, Color.red);
			for (int i=3; i<16; i++){
				c.setPixel(4, i, Color.MAGENTA);
			}
			for (int i=3; i<16; i++){
				c.setPixel(5, i, Color.MAGENTA);
			}
			c.setPixel(6, 4, Color.PINK);
			c.setPixel(6, 5, Color.PINK);
			c.setPixel(6, 6, Color.PINK);
			c.setPixel(7, 6, Color.PINK);
			c.setPixel(7, 7, Color.PINK);
			c.setPixel(7, 8, Color.PINK);
			c.setPixel(8, 8, Color.PINK);
			c.setPixel(8, 9, Color.PINK);
			c.setPixel(8, 10, Color.PINK);
			c.setPixel(9, 10, Color.PINK);
			c.setPixel(9, 11, Color.PINK);
			c.setPixel(10, 8, Color.PINK);
			c.setPixel(10, 9, Color.PINK);
			c.setPixel(10, 10, Color.PINK);
			c.setPixel(11, 6, Color.PINK);
			c.setPixel(11, 7, Color.PINK);
			c.setPixel(11, 8, Color.PINK);
			c.setPixel(12, 4, Color.PINK);
			c.setPixel(12, 5, Color.PINK);
			c.setPixel(12, 6, Color.PINK);
			for (int i=3; i<16; i++){
				c.setPixel(13, i, Color.ORANGE);
			}
			for (int i=3; i<16; i++){
				c.setPixel(14, i, Color.ORANGE);
			}
			
			System.out.println("Verkar funka");
		} else {
			System.out.println("Funkar inte");
		}
	}
		
		
		
		
/*		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryIt frame = new TryIt();
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
	public TryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.ASSIGNMENT_7);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		px.setPixel(10, 10, Color.BLACK);
		px.setPixel(10, 11, Color.WHITE);
		px.setPixel(10, 12, Color.BLACK);
		px.setPixel(10, 13, Color.WHITE);
	}

}
