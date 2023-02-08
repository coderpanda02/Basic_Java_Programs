package basic_java_programs;

import java.util.Scanner;

public class StarPattern11_Hollow_Inverted_Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Hollow Inverted Pyramid Star Pattern for "+n+" rows : ");
		
		for(int i=n-1; i>=0; i--) {
			
			//for spaces preceding stars
			for(int j=n-i-1; j>0; j--) { //j>0 instead of j>=0, as last line has 0 space
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				if(j==0 || j==i || i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  "); //two spaces in place of '* '
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
