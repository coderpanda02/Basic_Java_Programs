package basic_java_programs;

import java.util.Scanner;

//java code to check GCD(Greatest Common Divisor) by Euclidean method
//It is the efficient method and also the main algorithm used for this purpose.

//The algorithm is based on the below facts :

//1. If we subtract a smaller number from the larger one (we reduce a larger number),
//GCD doesn’t change. So if we keep subtracting repeatedly the larger of two, we end up with GCD.

//2. Now instead of subtraction, if we divide the smaller number,
//the algorithm stops when we find remainder 0.

//time complexity : O(log(max(a, b)))


public class GCD2_EuclideanMethod {
	
	
	private static int calculateGCD(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		
		return calculateGCD(b, a%b);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to check GCD: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD of "+a+" and "+b+" is : "+calculateGCD(a, b));

		
		sc.close();

	}

}
