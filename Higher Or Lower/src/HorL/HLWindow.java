package HorL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class HLWindow {
	
	public void msg(ImageIcon icon) {
		JOptionPane.showMessageDialog(null, icon); //sends a message to the user
	}
	
	public String in(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public void println(String msg) {
		System.out.println(msg);
	}
	
	public int option1(String[] options, String[][] strings) {
		return JOptionPane.showOptionDialog(null, strings, "Seating Chart Creator", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	}
	
	public void msg1(String s) {
		JOptionPane.showMessageDialog(null, s);
		
	}

	public void msg2(String[][] strings) {
		JOptionPane.showMessageDialog(null, strings);
		
	}

	public int option(String[] replay, String string) {
		// TODO Auto-generated method stub
		return JOptionPane.showOptionDialog(null, string, "Replay", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, replay, replay[0]);
	}


}
