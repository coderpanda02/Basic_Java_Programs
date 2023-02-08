package basic_java_programs;

import java.util.Scanner;       

public class Factorial2_UsingRecursion {
	
	private static int findFactorial(int n) {
		
//		if(n==0 || n==1) {   //0! = 1, 1! = 1
//			return 1;
//		}		
//		return n*findFactorial(n-1);
		
		//using ternary operator
		return (n == 0 || n == 1) ? 1 : n*findFactorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to find factorial : ");
		int n = sc.nextInt();
		
		System.out.println("Factorial of "+n+" is : "+findFactorial(n));
		
		
		sc.close();
	}

}
