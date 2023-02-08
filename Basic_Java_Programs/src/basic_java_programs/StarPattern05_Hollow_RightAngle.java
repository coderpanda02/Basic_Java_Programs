package basic_java_programs;

import java.util.Scanner;

public class StarPattern05_Hollow_RightAngle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n= sc.nextInt();
		
		System.out.println("Printing Hollow Right Angle Star Pattern for "+n+" rows : ");
		
		for(int i=0; i<n; i++) {
			
			for(int j=0; j<=i; j++) {
				
				if(j==0 || i==n-1 || j==i) {  //condition when to print stars
					System.out.print("* ");
				}
				else {
					System.out.print("  "); //Adding two spaces for '* '
				}
				
			}
			System.out.println();
		}
		
		sc.close();
	}

}
