package basic_java_programs;

import java.util.Scanner;

public class GCD3_ArrayofNumbers {
	
	private static int calculateGCD(int a, int b) {
		
		if(b == 0) {
			return a;
		}
		
		return calculateGCD(b, a%b);
		
	}
	
	
	private static int findGCD(int[] arr, int len) {
		
		int res = arr[0];
		for(int i=1; i<len; i++) {
			res = calculateGCD(res, arr[i]);
		}
		
		return res;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length for the array of numbers to check GCD: ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		} 
		
		System.out.println("GCD of the array is : "+findGCD(arr, len));

		sc.close();

	}


}
