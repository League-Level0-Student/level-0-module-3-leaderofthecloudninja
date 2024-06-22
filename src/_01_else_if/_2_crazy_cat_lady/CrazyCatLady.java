
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String catsint = JOptionPane.showInputDialog("how many cats do you have?");
		int cats = Integer.parseInt(catsint);
		// 2. Convert their answer into an int
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if(cats >= 3) {
			JOptionPane.showMessageDialog(null, "you are a crazy cat lady");
		}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
		if(cats < 3 && cats >0) {
			playVideo("https://bing.com/videos/search?q=cat+shorts+videos&mid=5741C687BA2642FC63D45741C687BA2642FC63D4&view=detail&FORM=VIRE&cc=US&setlang=en-US&cvid=cc904c04b8374b0e855af9da20755e5c&q");
		}
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(cats == 0) {
			playVideo("https://bing.com/WS/redirect?q=frog+sitting+on+bench+video&url=aHR0cHM6Ly93d3cueW91dHViZS5jb20vd2F0Y2g/dj1iS0NQRWRSaW1qbw==&form=WSBSTK&cvid=04f77c6a612143eba4fad24261e634c4&rtk=Pj4ic8xlSy4sMiOZSfcJzYlHHZsYesRPenpsZQk9lyuhocU%2F%2BvOq3fMO7%2Fxb%2F%2FUz");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

