package basic_java_programs;

import java.util.Scanner;

//	Perfect Number -> a positive integer that is equal to the sum of its proper divisors,
//					  excluding the number itself.
//		   example :  smallest perfect number is 6 (sum of 1, 2, 3 - which are factors of 6)
//	The first 5 perfect numbers are 6, 28, 496, 8128, and 33550336.

public class Perfect_Numbers {
	
	
	private static int findDivisorSum(int n) {
		
		int sum = 0;
		for(int i=1; i<n; i++) {
			
			if(n%i == 0) {
				sum += i;
			}
		}
				
		return sum;
					
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int sum = findDivisorSum(n);
		
		if(sum == n) {
			System.out.println(n+" is a Perfect number.");
		}
		else {
			System.out.println(n+" is not a Perfect number.");

		}
				
		sc.close();		
		
	}

}
