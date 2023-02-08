package basic_java_programs;

import java.util.Scanner;

public class StarPattern09_InvertedPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Inverted Pyramid Star Pattern for "+n+" rows : ");
		
		for(int i=n-1; i>=0; i--) {
			
			for(int j=n-i-1; j>0; j--) {  //for printing spaces
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) { //for printing stars
				System.out.print("* "); //"* " -> * and space together creating pyramid shape
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
