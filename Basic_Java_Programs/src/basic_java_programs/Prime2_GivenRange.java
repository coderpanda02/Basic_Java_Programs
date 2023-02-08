package basic_java_programs;

import java.util.Scanner;

public class Prime2_GivenRange {
	
	private static boolean checkPrime(int i) {
		
		if(i==0 || i==1) {
			return false;
		}
		
		for(int j=2; j<=i/2; j++) {
			
			if(i%j == 0) {
				return false;
			}
		}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower and upper value for the range : ");
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		System.out.println("The Prime numbers between "+low+" and "+high+" are : ");
		
		for(int i=low; i<=high; i++) {
			
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
		
		sc.close();
		
	}

}
