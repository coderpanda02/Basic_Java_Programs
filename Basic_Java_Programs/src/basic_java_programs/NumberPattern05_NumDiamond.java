package basic_java_programs;

import java.util.Scanner;

// printing the number pattern ->
//		  1
//	    2 1 2
//	  3 2 1 2 3
//	4 3 2 1 2 3 4
//	  3 2 1 2 3
//		2 1 2
//		  1

public class NumberPattern05_NumDiamond {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int n = sc.nextInt();
		
		System.out.println("Printing the Diamond Number Pattern for "+n+" rows : ");
		
		//for upper part
		for(int i=1; i<=n; i++) {
			
			//for spaces preceding the numbers
			for(int j=n-i; j>0; j--) {  //j=n-i instead of j=n-i-1, as i=1
				System.out.print("  "); //2 spaces for num+" "
			}
			
			//for printing numbers
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		//for lower part
		for(int i=n-1; i>=1; i--) {
			
			for(int j=n-i; j>0; j--) {
				System.out.print("  ");
			}
			
			for(int j=i; j>=1; j--) {
				System.out.print(j+" ");
			}
			
			for(int j=2; j<=i; j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		sc.close();
	}

}
