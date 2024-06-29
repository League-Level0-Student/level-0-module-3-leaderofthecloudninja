package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
public static void main(String[] args) {
String happy = JOptionPane.showInputDialog("are you happy?");	
	int happyint = Integer.parseInt(happy);
	int no = Integer.parseInt(nopath);
	if(happy.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null,"Keep doing what your doing");	
	}
	if(happy.equalsIgnoreCase("no")) {
	String nopath =	JOptionPane.showInputDialog(null,"Do you want to be happy?");
	}
	
	if(nopath.equalsIgnoreCase("no")) {
		JOptionPane.showMessageDialog(null,"Keep doing what your doing");	
	}
	
}
}
