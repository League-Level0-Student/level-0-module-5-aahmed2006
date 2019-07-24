package extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot r2d2 = new Robot();
		// 2. Set the speed to 100
		r2d2.setSpeed(100);
		r2d2.hide();
		r2d2.setPenWidth(2);
		r2d2.setY(595);
		int colorChoice = JOptionPane.showOptionDialog(null, "Which color would you like?", "color choice",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "red", "blue", "green", "black" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 0) {
			r2d2.setPenColor(Color.red);
		} else if(colorChoice == 1) {
			r2d2.setPenColor(Color.blue);
		} else if(colorChoice == 2) {
			r2d2.setPenColor(Color.green);
		} else if(colorChoice == 3) {
			r2d2.setPenColor(Color.black);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String polygons = JOptionPane.showInputDialog("How many polygons would you like to be drawn?");
		// 5. Use the robot to draw the number of polygons the user requested.
		int polygon = Integer.parseInt(polygons);
		for (int i = 0; i < polygon; i++) {
			for (int a = 0; a < 4; a++) {
				r2d2.penDown();
				r2d2.move(25);
				r2d2.turn(90);
			}
			r2d2.penUp();
			r2d2.move(30);
		}
		// 6. Make it so your shapes do not overlap
				
		// 7. Challenge: add more colors to the Option Dialog.
	}
}
