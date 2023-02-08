package basic_java_programs;

import java.util.Scanner;

public class StarPattern06_Right_Pascals_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Right Pascal's Triangle for "+n+" rows : ");
		
		//for upper part
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//for lower part
		for(int i=n-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
