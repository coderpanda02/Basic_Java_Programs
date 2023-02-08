package basic_java_programs;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		
		int n = sc.nextInt();
		int num = n, sum = 0, rem;
		
		while(num > 0) {
			
			rem = num % 10;
			sum = 10*sum + rem;
			num = num/10;
			
		}
		
		if(sum == n) {
			System.out.println(n+" is Palindrome.");
		}
		else {
			System.out.println(n+" is not Palindrome.");
		}
		
		
		
		sc.close();
		
	}

}
