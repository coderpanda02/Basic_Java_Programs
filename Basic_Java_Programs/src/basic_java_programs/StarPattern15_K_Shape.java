package basic_java_programs;

import java.util.Scanner;

public class StarPattern15_K_Shape {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(("Enter the number of rows to print : "));
		int n = sc.nextInt();
		
		System.out.println("Printing K-Shaped Star Pattern for "+n+" rows : ");
		
		//for upper part of K
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//for lower part of K
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
