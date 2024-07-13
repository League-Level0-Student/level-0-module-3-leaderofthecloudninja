package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("are you happy?");
		if (happy.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing what your doing");
		}
		else{
			String nopath = JOptionPane.showInputDialog(null, "Do you want to be happy?");

			if (nopath.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing what your doing");
			} 
			else {
				JOptionPane.showMessageDialog(null, "Change");
			}
		}
	}
}
