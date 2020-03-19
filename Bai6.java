//Example Bai6.java
import java.util.Scanner;


public class Bai6 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số thứ nhất: ");
        String strNum1 = scanner.nextLine();
        System.out.println("Nhập vào số thứ hai: ");
        String strNum2 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        if(num1 == 0) {
        	if(num2 == 0) {
        		System.out.println("Phương trình bậc nhất có 1 biến : " + num1 + "x = " + num2 );	
        		System.out.println(" có vô số nghiệm");
        		System.out.println("phương trình bậc nhất có 2 biến : " + num1 + " x " + " + "+ num2+ " = 0");
        		System.out.println(" có vô số nghiệm");
        		System.out.println("Phương trình bậc 2 là: " + num1 + " x^2 " + "= " + num2);
        		System.out.println(" có vô số nghiệm");
    	}
    	else {
    		System.out.println("Phương trình bậc nhất có 1 biến : " + num1 + "x = " + num2 );
    		System.out.println(" vô nghiệm");
    		System.out.println("phương trình bậc nhất có 2 biến : " + num1 + " x " + " + "+ num2+ " = 0");
    		System.out.println(" vô nghiệm");
    		System.out.println("Phương trình bậc 2 là: " + num1 + " x^2 " + "= " + num2);
    		System.out.println(" vô nghiệm");
    		}
    }
    else {
    		double x1 = num2 / num1;
    		double x2 = -num2 / num1;
    		double x3 =  num2 / num1;
    		double X1 = Math.sqrt(x3);
    		
    		
        System.out.println("Phương trình bậc nhất có 1 biến : " + num1 + "x = " + num2 );	
        System.out.println(" \t có nghiệm là x = " + x1);
        System.out.println("phương trình bậc nhất có 2 biến : " + num1 + " x " + " + "+ num2+ " = 0");
        System.out.println(" \t có nghiệm là x = " + x2);
        System.out.println("Phương trình bậc 2 là: " + num1 + " x^2 " + "= " + num2);
        System.out.println(" \t có nghiệm x1 = " + X1 );
		System.out.println("  \t  có nghiệm x2 = -" + X1);
    }
        
	
	}

}

