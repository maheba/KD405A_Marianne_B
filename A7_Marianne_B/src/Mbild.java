import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class Mbild {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		PixelController c = PixelController.getInstance(Screen.MEDEA_1); //MEDEA_1   ASSIGNMENT_7
		//Wait until connected...
		int count = 0;
		while (c.isConnected() == false && count <20) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ej uppkopplad");
			count ++;
		}
		if (c.isConnected()) {
			//Måla upp pixelbild:
			for (int i=3; i<16; i++){
				c.setPixel(i, 4, Color.MAGENTA);
			}
			for (int i=3; i<16; i++){
				c.setPixel(i, 5, Color.MAGENTA);
			}
			c.setPixel(4, 6, Color.PINK);
			c.setPixel(5, 6, Color.PINK);
			c.setPixel(6, 6, Color.PINK);
			c.setPixel(6, 7, Color.PINK);
			c.setPixel(7, 7, Color.PINK);
			c.setPixel(8, 7, Color.PINK);
			c.setPixel(8, 8, Color.PINK);
			c.setPixel(9, 8, Color.PINK);
			c.setPixel(10, 8, Color.PINK);
			c.setPixel(10, 9, Color.PINK);
			c.setPixel(11, 9, Color.PINK);
			c.setPixel(8, 10, Color.PINK);
			c.setPixel(9, 10, Color.PINK);
			c.setPixel(10, 10, Color.PINK);
			c.setPixel(6, 11, Color.PINK);
			c.setPixel(7, 11, Color.PINK);
			c.setPixel(8, 11, Color.PINK);
			c.setPixel(4, 12, Color.PINK);
			c.setPixel(5, 12, Color.PINK);
			c.setPixel(6, 12, Color.PINK);
			for (int i=3; i<16; i++){
				c.setPixel(i, 13, Color.ORANGE);
			}
			for (int i=3; i<16; i++){
				c.setPixel(i, 14, Color.ORANGE);
			}
			
			System.out.println("Verkar funka");
		} else {
			System.out.println("Funkar inte");
		}
		//c.clearConnection();
	}
}
