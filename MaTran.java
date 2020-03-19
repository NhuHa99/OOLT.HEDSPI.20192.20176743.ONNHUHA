package Week2;
//Example bai7
import java.util.Scanner;

public class MaTran {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số cột của ma trận:");
		int n = scanner.nextInt();
		System.out.println("Nhập số dòng của ma trận:");
		int m = scanner.nextInt();
		
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		System.out.println("Nhập các phần tử cho ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print("A[" + i + "," + j + "] = ");
	            A[i][j] = scanner.nextInt();
	        }
	    }
	    System.out.println("Ma trận A:");
	    for (int i = 0; i < m; i++) {
	        for (int j = 0; j < n; j++) {
	            System.out.print(A[i][j] + "\t");
	        }
	        System.out.println("\n");
	    }
	    System.out.println("Nhập các phần tử cho ma trận B:");
	    for(int i=0; i<m; i++) {
	    	for(int j=0; j < n; j++) {
	    		System.out.print("B[" + i+ "," +j+"]=" );
	    		B[i][j] = scanner.nextInt();
	    	}
	    }
	    System.out.println("Ma trận B:");
	    for(int i=0; i<n;i++) {
	    	for(int j=0; j<n;j++) {
	    		System.out.print(B[i][j] + "\t");
	    	}
	    	System.out.println("\n");
	    	
	    }
	}
}
	    
	
	


