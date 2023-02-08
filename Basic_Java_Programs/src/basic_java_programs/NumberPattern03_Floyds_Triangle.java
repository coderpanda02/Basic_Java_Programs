package basic_java_programs;

import java.util.Scanner;

//Floyd's Triangle - It is a left to right arrangement of natural numbers
//					 in a right-angled triangle.
//ex ->       	1
//				2 3
//				4 5 6
//				7 8 9 10

public class NumberPattern03_Floyds_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Number Pattern for "+n+" rows : ");
		
		int k = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		
		//for printing alphabet
//		System.out.println("Printing Alphabet Pattern for "+n+" rows : ");
//		
//		int k = 0, c = 65; //c = 97
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print((char)(c+k)+" ");
//				k++;
//			}
//			System.out.println();
//		}
		
		sc.close();
	}

}
