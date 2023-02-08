package basic_java_programs;

import java.util.Scanner;

//	Binary to Decimal conversion is to convert a number given in Binary number system (0, 1)
//	to its equivalent in Decimal number system (0-9).
//			ex : 101101 -> 1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 32+8+4+1 = 45

//	Approach ->
//		1. take last_digit=num%10, multiply with base, where base=1 (as 2^0=1)
//		2. add value to result, res=0 -> res =  res+(rem*base)
//		3. num = num/10 (remove last digit), base = base*2, repeat until num=0


public class Convert_Binary_Decimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Binary number to convert in Decimal : ");
		int n = sc.nextInt();
		
		int num = n;
		int base = 1, res = 0;
		
		while(num>0) {
			
			int rem = num%10;
			res += rem*base;
			num = num/10;
			base = base*2;
			
		}
		System.out.println("Decimal equivalent of '"+n+"' is : "+res);
		
		sc.close();
	}

}
