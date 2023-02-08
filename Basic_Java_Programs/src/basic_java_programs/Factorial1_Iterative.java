package basic_java_programs;

import java.util.Scanner;

//Factorial of a non-negative integer is multiplication of all integers smaller than or equal to n.
//For example factorial of 5 -> 5! = 5*4*3*2*1 = 120. 

public class Factorial1_Iterative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial : ");
		int n = sc.nextInt();
		
		int res = 1;
		for(int i=2; i<=n; i++) {
			res = res*i;
		}
		
		System.out.println("The factorial of "+n+" is : "+res);
		
		sc.close();
	}

}
