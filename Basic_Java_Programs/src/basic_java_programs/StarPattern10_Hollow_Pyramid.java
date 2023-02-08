package basic_java_programs;

import java.util.Scanner;

// printing Hollow Pyramid or Equilateral Triangle star pattern

public class StarPattern10_Hollow_Pyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing the Hollow Pyramid Star Pattern for "+n+" rows : ");
		
		for(int i=0; i<n; i++) {
			
			for(int j=n-i-1; j>0; j--) { //for outer spaces preceding the stars
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				if(j==0 || j==i || i==n-1) { //condition for printing stars
					System.out.print("* ");
				}
				else {
					System.out.print("  "); //two spaces, as printing '* ' instead of '*'
				}
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
