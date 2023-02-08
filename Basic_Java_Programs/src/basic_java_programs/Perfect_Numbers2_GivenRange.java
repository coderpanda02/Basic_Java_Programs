package basic_java_programs;

import java.util.Scanner;

//The first 4 perfect numbers are 6, 28, 496, 8128.

public class Perfect_Numbers2_GivenRange {
	
	
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
		
		System.out.println("Enter the lower and upper range : ");
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		System.out.println("Perfect numbers between "+low+" and "+high+" are : ");
		
		for(int i=low; i<=high; i++) {
			
			int sum = findDivisorSum(i);
			
			if(sum == i) {
				System.out.print(i+" ");
			}
			
		}
		
		sc.close();
		

	}

}
