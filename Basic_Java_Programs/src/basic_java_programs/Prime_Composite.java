package basic_java_programs;

import java.util.Scanner;

//	Prime number -> has exactly two factors - 1 and itself
//	Composite number -> has at least one factor other than 1 and itself
//	0 and 1 are neither prime nor composite


public class Prime_Composite {
	
	private static boolean checkPrime(int a) {
		
		for(int i=2; i<=a/2; i++) {
			
			if(a%i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
				
		int a = sc.nextInt();
		
		if(a == 0 || a == 1) {
			System.out.println(a+" is neither Prime nor Composite number!");
		}
		else {
						
			if(checkPrime(a)) {
				System.out.println(a+" is a Prime Number.");			
			}
			else {
				System.out.println(a+" is a Composite Number.");
			}
		}	
		
		
		sc.close();
		
	}
}
