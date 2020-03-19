package Week2;
//Example bai4
import java.util.Scanner;

public class TamGiac {
   public static void main(String[] args) {
	Scanner tamgiac = new Scanner(System.in);
	System.out.println("Nhap chieu cao n= ");
	int n = tamgiac.nextInt();
	System.out.println("Ta có hình tam giác là:");
	for (int a = 1; a <= n; a++) {
		for (int sp = n -a ; sp >=1; sp--) {
			System.out.print(" ");
		}
		for (int c=1; c<=a;c++);{
			System.out.print("*");
		}
		for(int k = 2; k<= a; k++) {
			System.out.print("*");
		}
		System.out.println();
		
		}
	}
	
  }
