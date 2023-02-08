package basic_java_programs;

import java.util.Scanner;

public class StarPattern12_Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Diamond Star Pattern for "+n+" rows :  ");
		
		//upper part pyramid
		for(int i=0; i<n; i++) {
			
			for(int j=n-i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//lower part pyramid		
		for(int i=n-2; i>=0; i--) { //lower part has 1 less row, so i=n-2 instead of n-1
			
			for(int j=n-i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
