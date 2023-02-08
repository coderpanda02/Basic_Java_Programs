package basic_java_programs;

import java.util.Scanner;

//Co-Prime Factors -> factors of a numbers that do not have any common factor other than 1.
//example :  6 have two co-prime factors - 2 and 3 

public class Prime4_Prime_Factors {
	
	
	private static boolean checkPrime(int i) {
		
		if(i==1) {   //no need to check for i==0, as i starts from 1
			return false;
		}
		
		for(int j=2; j<i; j++) {  //instead of j<i/2, use j<i
			
			if(i%j == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	private static boolean checkPrimeFactors(int n) {
		
		boolean flag = false;
		int count = 0;
		
		for(int i=1; i<n; i++) {
			
			if(n%i == 0) {   // checking for factors
				if(checkPrime(i)) {
					
					if(count<1) {
						System.out.println("The Prime factors are : ");
						count++;
						
					}
					System.out.print(i+" ");
					flag = true;
				}
				
			}
		}
		return flag;	
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check prime factors: ");
		int n = sc.nextInt();
		
		if(!checkPrimeFactors(n)) {
			System.out.println("There are no prime factors found for "+n+"!");
		}
		
		
		sc.close();

	}

}
