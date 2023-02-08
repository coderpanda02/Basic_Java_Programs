package basic_java_programs;

import java.util.Scanner;

// printing number pattern ->       1
//									1 2
//									1 2 3
//								 	1 2 3 4	

public class NumberPattern01_Right_Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing the Number Pattern for "+n+" rows : ");
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		//for alphabet pattern
//		System.out.println("Printing the Alphabet Pattern for "+n+" rows : ");
//		
//		int c = 65;  //ASCII value for A is 65, a is 97
////	int c = 97;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print((char)(c+j)+" ");
//			}
//			System.out.println();
//		}
		
		sc.close();
	}

}
