package basic_java_programs;

import java.util.Scanner;

// Co-Prime -> pairs of numbers that do not have any common factor other than 1.
// example :   (2,3) , (4,5)
// Approach is to calculate GCD (Greatest Common Divisor), if GCD = 1, numbers are co-prime

public class Prime3_Co_Prime {

	
	private static int calculateGCD(int a, int b) {

		if(b == 0) {
			return a;
		}
		
		return calculateGCD(b, a%b);
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers to check Co-Prime: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		if(calculateGCD(a, b) == 1) {
			System.out.println(a+" and "+b+" are Co-Prime numbers.");
		}
		else {
			System.out.println(a+" and "+b+" are not Co-Prime numbers.");
		}
		
		sc.close();
		
	}

}
