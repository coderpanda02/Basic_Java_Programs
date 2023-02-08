package basic_java_programs;

import java.util.Scanner;

// GCD of two numbers is the largest number that divides both of them.

// java code to check GCD(Greatest Common Divisor) or HCF (Highest Common Factor)
// by subtraction method
// time complexity : O(max(a, b))

public class GCD1_SubtractionMethod {
	
	private static int calculateGCD(int a, int b) {
		
		if(a == 0) {   //gcd(0, b) -> b
			return b;
		}
		
		if(b == 0) {
			return a;
		}
		
		if(a == b) {
			return a;
		}
		
		if(a>b) {
			return calculateGCD(a-b, b);
		}
		return calculateGCD(a, b-a);
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
