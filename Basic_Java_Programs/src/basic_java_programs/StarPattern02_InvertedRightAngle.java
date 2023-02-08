package basic_java_programs;

import java.util.Scanner;

public class StarPattern02_InvertedRightAngle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Inverted Right Angle Star Pattern for "+n+" rows : ");
		
		for(int i=n-1; i>=0; i--) {  //rows
			for(int j=0; j<=i; j++) {  //for printing stars
				System.out.print("* ");
			}
			System.out.println();
		}
	
		sc.close();	

	}

}
