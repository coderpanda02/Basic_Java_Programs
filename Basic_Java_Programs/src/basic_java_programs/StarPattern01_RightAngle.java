package basic_java_programs;

import java.util.Scanner;

public class StarPattern01_RightAngle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
//		System.out.println("Enter the symbol to print : ");
//		char c = sc.next().charAt(0); 
		
		System.out.println("Printing Right Angle Star Pattern for "+n+" rows : ");
		
		for(int i=0; i<n; i++) {  //rows			
			for(int j=0; j<=i; j++) {  //for printing stars
				
//				System.out.print(c+" "); //for printing user input chars
				System.out.print("* ");
			}
			System.out.println();
		}
	
		sc.close();	
	}

}
