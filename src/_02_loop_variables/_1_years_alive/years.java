package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class years {
	public static void main(String[] args) {
		String years = JOptionPane.showInputDialog("what year were you born in?");
		int yearsint = Integer.parseInt(years);
		for (int i = 0; i <= 14; i++) {
			JOptionPane.showMessageDialog(null,  (yearsint + i) );
		}
	}
}
