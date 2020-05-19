package HorL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HLWindow {
	
	public void msg(ImageIcon icon) {
		JOptionPane.showMessageDialog(null, icon); //sends an image message to the user
	}
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg); //asks the user to input something, showing the msg to them
	}
	
	public void println(String msg) {
		System.out.println(msg); //prints a simple string msg
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s); //sends a message to the user 
		
	}

	public void msg2(String[][] strings) {
		JOptionPane.showMessageDialog(null, strings); //sents a 2d string message to the user
		
	}

}
