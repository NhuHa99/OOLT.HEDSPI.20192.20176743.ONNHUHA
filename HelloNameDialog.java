//Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String args[]) {
		String result;
		result = JOptionPane.showInputDialog("Pleas inter your name1");
		JOptionPane.showMessageDialog(null, "hi" + result +"!");
		System.exit(0);
		
	}

}
