package basic_java_programs;

import java.util.Scanner;

//	LCM (Least Common Multiple) of two non-zero integers (a, b) is 
//	the smallest positive integer that is perfectly divisible by both a and b.
//	LCM of any number with zero(0) is 0.


public class LCM1_TwoNumbers {
		
	private static int calculateLCM(int a, int b) {
				
		if(a == 0 || b == 0) {
			return 0;
		}
		
		int lcm = (a>b?a:b); //assign lcm = largest number
		
		while(lcm>0) {
			
			if(lcm % a == 0 && lcm % b == 0) {
				
				break;
			}
			lcm++;
		}
			
		return lcm;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers to calculate LCM : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int lcm = calculateLCM(a, b);
		System.out.println("LCM of "+a+" and "+b+" is : "+lcm);
		
		sc.close();
		
	}

}
