package basic_java_programs;

import java.util.Scanner;

public class PalindromeNumber_GivenRange {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower and upper value for the range : ");
		
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		System.out.println("The Palindrome numbers between "+low+" and "+high+" are : ");
		
		for(int i=low; i<=high; i++) {
			
			int num = i, sum = 0, rem;
					
			while(num>0) {
				
				rem = num%10;
				sum = 10*sum + rem;
				num = num/10;
			}
			
			if(sum == i) {
				System.out.print(i+" ");
			}
		}
		
		
		
		sc.close();
		
	}

}
