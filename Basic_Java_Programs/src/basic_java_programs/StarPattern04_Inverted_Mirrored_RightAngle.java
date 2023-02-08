package basic_java_programs;

import java.util.Scanner;

public class StarPattern04_Inverted_Mirrored_RightAngle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Inverted Mirrored Right Angle"
							+ " Star Pattern for "+n+" rows : ");
		
		for(int i=n-1; i>=0; i--) {
			
			//for spaces preceding stars
			for(int j=2*(n-i-1); j>0; j--) { //j>0 instead of j>=0, as last line has 0 space
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) { //for printing stars
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
