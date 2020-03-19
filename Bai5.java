//Example Bai5.java
import java.text.DecimalFormat;

import java.util.Scanner;

public class Bai5 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số thứ nhất: ");
        String strNum1 = scanner.nextLine();
        System.out.println("Nhập vào số thứ hai: ");
        String strNum2 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2 ;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 +" = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        
        
      
        
       
        
        
			
	}
	
}
