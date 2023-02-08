package basic_java_programs;

import java.util.Scanner;

//Pascal's Triangle: A triangular array of numbers in which those at the ends of the rows are 1
//					and each of the others is the sum of the nearest two numbers in the row above.
//
// example : for 5 rows ->     1  
//							  1 1
//							 1 2 1
//						    1 3 3 1
//						   1 4 6 4 1 
//
// To calculate the middle numbers, i.e the sum of the above row nearest numbers,
// We are going to follow the formula -> number = number*(i-j)/(j+1) 


public class NumberPattern04_Pascals_Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows to print : ");
		int n = sc.nextInt();
		
		System.out.println("Printing Pascal's Triangle for "+n+" rows : ");
		
		for(int i=0; i<n; i++) {
			
			//for spaces preceding numbers
			for(int j=n-i-1; j>0; j--) {
				System.out.print(" ");
			}
			
			//for printing numbers
			int num = 1; //initializing number as 1 every time before the loop starts
			for(int j=0; j<=i; j++) {
				
				//printing the number and doing calculation for next column
				System.out.print(num+" "); 
				num = num*(i-j) / (j+1);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
