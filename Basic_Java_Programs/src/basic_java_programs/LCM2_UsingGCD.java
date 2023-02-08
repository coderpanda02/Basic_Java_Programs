package basic_java_programs;

import java.util.Scanner;

// LCM for two numbers : LCM = (num1 * num2) / GCD

public class LCM2_UsingGCD {
	
	
	private static int calculateGCD(int i, int j) {
		
		if(j == 0) {
			return i;
		}
		
		return calculateGCD(j, i%j);	
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to calculate LCM : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		int gcd = calculateGCD(n1, n2);
		int lcm = (n1*n2) / gcd;
		System.out.println("LCM of "+n1+" and "+n2+" is : "+lcm);
		
		
		sc.close();
		
	}

}
