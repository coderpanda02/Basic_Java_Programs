package basic_java_programs;

import java.util.Scanner;

//printing number pattern ->        1
//									2 2
//									3 3 3
//									4 4 4 4

public class NumberPattern02_Right_Triangle_Row {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n =sc .nextInt();
		
		System.out.println("Printing the Number Pattern for "+n+" rows : ");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		//for Alphabet Pattern
//		System.out.println("Printing the Alphabet Pattern for "+n+" rows : ");
//		
//		int c = 65;
////	int c = 97;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print((char)(c+i)+" ");
//			}
//			System.out.println();
//		}
	
		sc.close();
		
	}

}
