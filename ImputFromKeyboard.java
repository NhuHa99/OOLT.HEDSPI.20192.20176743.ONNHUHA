package Week2;
//Example bai2
import java.util.Scanner;

public class ImputFromKeyboard {
	public static void main (String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("what's your name?");
		String name = keyboard.nextLine();
		System.out.println("how old are you?");
		int age = keyboard.nextInt();
		System.out.println("how tall are you (m)?");
		double height = keyboard.nextDouble();
		System.out.println("Mrs/Ms: " + name + "," + age +" years old. " + "," + "Your height is " + height +"m.");
		
	}

}
