package basic_java_programs;

import java.util.Scanner;

public class StarPattern13_Hollow_Diamond {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Hollow Diamond Star Pattern for "+n+" rows :  ");
		
		//for upper part pyramid
		for(int i=0; i<n; i++) {
			
			//for spaces preceding stars
			for(int j=n-i-1; j>0; j--) { //j>0 instead of j>=0, as last row has no space
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				//condition for printing stars
				if(j==0 || j==i) { //i==n-1 is not required here
					System.out.print("* ");
				}
				else {
					System.out.print("  "); //two spaces in place of '* '
				}
			}
			
			System.out.println();
		}
		
		//for lower part pyramid
		for(int i=n-2; i>=0; i--) { //i=n-2 as lower part has 1 less row
			
			for(int j=n-i-1; j>0; j--) { 
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				if(j==0 || j==i) { 
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		sc.close();
		
	}

}
