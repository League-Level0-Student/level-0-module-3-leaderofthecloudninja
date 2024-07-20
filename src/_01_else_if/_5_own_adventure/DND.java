package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class DND {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "???: HI!");
JOptionPane.showInputDialog("???: Whats your name???");
JOptionPane.showMessageDialog(null, "???: wow, I...");	
JOptionPane.showMessageDialog(null, "???: I...");		
JOptionPane.showMessageDialog(null, "???: Have never heard of you in my entire life!!!");		
JOptionPane.showMessageDialog(null, "???: Oh, you're bored? here, I'll give you a monster to fight");	
JOptionPane.showMessageDialog(null, "Game: A monster has appeared!");		
String fight = JOptionPane.showInputDialog("Game: Your turn! What do you do? (Punch or Run)");
if(fight.equalsIgnoreCase("punch"))
{
JOptionPane.showMessageDialog(null, "Game: You punch the monster");
JOptionPane.showMessageDialog(null, "Game: It does 0 damage!");
JOptionPane.showMessageDialog(null, "Game: Monster's turn");
JOptionPane.showMessageDialog(null, "Game: It punches you");
JOptionPane.showMessageDialog(null, "Game: It does 999 damage!");
JOptionPane.showMessageDialog(null, "Game: You Lose...");
JOptionPane.showMessageDialog(null, "???: ...that...should not have happened, that creature shouldnt have one shot capabilities...");	
JOptionPane.showMessageDialog(null, "*typing noises* ...and i am...finished! ok, try again.");
 String fight2 = JOptionPane.showInputDialog("Game: Your turn! What do you do? (Punch or Run)");
 if(fight2.equalsIgnoreCase("punch"))
 {
 JOptionPane.showMessageDialog(null, "Game: You punch the monster");
 JOptionPane.showMessageDialog(null, "Game: It does 999 damage!");
 JOptionPane.showMessageDialog(null, "Game: You Win!");
 JOptionPane.showMessageDialog(null, "???: ...");
 JOptionPane.showMessageDialog(null, "???: You...shouldnt be able to one shot either...");
 JOptionPane.showMessageDialog(null, "???: You know what...im too tired for this right now...*typing noises*");
}
 if(fight.equalsIgnoreCase("run")){
	 JOptionPane.showMessageDialog(null, "Game: You run away!");
	 JOptionPane.showMessageDialog(null, "???: ...");	
	 JOptionPane.showMessageDialog(null, "???: Wow, you just...ran...");		
	 JOptionPane.showMessageDialog(null, "???: Wow...");	
	 JOptionPane.showMessageDialog(null, "???: I at least expected you to try and fight...");	
	 JOptionPane.showMessageDialog(null, "???: anyways, my name is, The Creator!!!!!!!!!");
	 JOptionPane.showMessageDialog(null, "Creator: I made the game you are in right now!!!!!!!!!!");
	 JOptionPane.showInputDialog(null, "Creator: So, *Player Name Here*, how is the game so far?");
	 JOptionPane.showMessageDialog(null, "Creator: *Writing down answer* aaaaaaand...Done! thank you for your input!");
	 JOptionPane.showMessageDialog(null, "Game: You have been kicked from the game.");
	 



}
 if(fight2.equalsIgnoreCase("run")){
	 JOptionPane.showMessageDialog(null, "Game: You run away!");
	 JOptionPane.showMessageDialog(null, "???: ...");	
	 JOptionPane.showMessageDialog(null, "???: Wow, you just...ran...");		
	 JOptionPane.showMessageDialog(null, "???: Wow...");	
	 JOptionPane.showMessageDialog(null, "???: I at least expected you to try and fight...");	
	 JOptionPane.showMessageDialog(null, "???: anyways, my name is, The Creator!!!!!!!!!");
	 JOptionPane.showMessageDialog(null, "Creator: I made the game you are in right now!!!!!!!!!!");
	 JOptionPane.showInputDialog(null, "Creator: So, *Player Name Here*, how is the game so far?");
	 JOptionPane.showMessageDialog(null, "Creator: *Writing down answer* aaaaaaand...Done! thank you for your input!");}
     JOptionPane.showMessageDialog(null, "Game: You have been kicked from the game.");}
}
}
