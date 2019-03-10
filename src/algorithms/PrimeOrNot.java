package algorithms;

import javax.swing.JOptionPane;
import javax.xml.bind.helpers.ParseConversionEventImpl;

public class PrimeOrNot {
	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("What is your number?");
		int num = Integer.parseInt(number);
		for(int i = 2; i<num; i++) {
		 if(num%i==0) {
			 JOptionPane.showMessageDialog(null, "Your number is not prime.");
			 break;
		 } else {
			 JOptionPane.showMessageDialog(null, "Your number is prime.");
			 break;
		 }
		}
	}
}
