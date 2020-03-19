package Week2;
//Example bai6
import java.util.Scanner;


public class Mang {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng:");
		int n = scanner.nextInt();
		
		int array[] = new int[n];//khởi tạo mảng
		System.out.println("Nhập các phần tử trong mảng:");
		for(int i = 0; i<n; i++) 
		{
		System.out.print("nhập phần tử thứ " + i + ":");
		array[i]= scanner.nextInt();
		}
		//Hiển thị mảng ban đầu
		System.out.println("Mảng ban đầu:");
		for(int i=0; i<n; i++) 
		{
			System.out.print(array[i] +"\t");
		}
		//Tính tổng các phần tử trong mảng
		int sum= 0;
		for(int i=0; i<n; i++) {
			sum += array[i];
		}
		System.out.println("tổng các phần tử trong mảng : " + sum);
		double tb = sum / n ;
		System.out.println("giá trị trung bình của mảng là: " + tb);
		int c;
		//xắp sếp các phần tử trong mảng theo thứ tự giảm dần
		for(int i=0; i<n-1;i++) {
			for(int j=i+1;j<= n-1; j++) {
				if( array[i] < array[j]) {
					c = array[i];
					array[i]=array[j];
					array[j]= c;
				}
			}
		}
		System.out.println("Mảng sau khi sắp xếp :");
		for(int i=0; i<n; i++)
			System.out.print(array[i] + "\t");
		
	}

}
