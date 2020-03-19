//Example 3: ShowTwoNumber.java
import javax.swing.JOptionPane;

public class ShowTwoNumber {
	public static void main(String args[]) {
		String strNum1, strNum2;
		String strNotification = "you're just intered: ";
		strNum1 = JOptionPane.showInputDialog(null, "Pleas input the first number:", "input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + "and";
		
		strNum2 = JOptionPane.showInputDialog(null, "Pleas input the second number:", "input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification, "show two nuber", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
