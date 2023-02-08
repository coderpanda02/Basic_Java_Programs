package basic_java_programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to print : ");
		int n = sc.nextInt();
				
		if(n == 0) {
			
			System.out.println("Please enter a number greater than '0'!");
			
		}else {
			
			System.out.println("Fibonacci Series upto "+n+" elements is : ");
			
			int f1 = 0, f2 = 1;
			System.out.print(f1+" ");
			
			for(int i=0; i<n-1; i++) {
				
				System.out.print(f2+" ");
				int next = f1 + f2;
				f1 = f2;
				f2 = next;
			}
			
		}
		
		sc.close();
		
	}

}
