package basic_java_programs;

import java.util.Scanner;

public class Fibonacci_usingRecursion {
	
	private static int printFibonacci(int i, int j, int n) { 
		
		if(n == 0) {
			return 0;
		}
		
		System.out.print(j+" ");
		
		int next = i + j;
		return printFibonacci(j, next, n-1);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to print : ");
		int n = sc.nextInt();
		
		if(n == 0) {
			System.out.println("Please enter a number greater than zero!");
		}
		else {
			
			System.out.println("Fibonacci Series upto "+n+" elements is : ");
			
			int f1 = 0, f2 = 1;	
			
			System.out.print(f1+" ");
			printFibonacci(f1, f2, n-1);
			
		}
		
		sc.close();
	}

}
