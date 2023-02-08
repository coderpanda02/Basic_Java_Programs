package basic_java_programs;

import java.util.Scanner;

//	Decimal to Binary conversion is to convert a number given in decimal number system (0-9)
//	to its equivalent in binary number system (0, 1).
//			ex : 46 => 1*2^5 + 0*2^4 + 1*2^3 + 1*2^2 + 1*2^1 + 0*2^0 = 101110

//	Approach ->
//		1. Storing num%2 values in an array
//		2. num = num/2 and repeat until num = 0
//		3. print array values in reverse order

public class Convert_Decimal_Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Decimal number to convert in Binary: ");
		int n = sc.nextInt();

		int num = n;		
		int[] arr = new int[1000];
		int count = 0;
		
		while(num > 0) {
			
			int rem = num%2;
			arr[count] = rem;
			num = num/2;
			count++;
			
		}
		System.out.print("Binary equivalent of '"+n+"' is : ");
		for(int i=count-1; i>=0; i-- ) {
			System.out.print(arr[i]);
		}
		
		sc.close();
	}

}
