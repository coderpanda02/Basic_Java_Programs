package basic_java_programs;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		
		int num = n, sum = 0, rem;
		while(num>0) {
			rem = num%10;
			sum += rem;
			num /= 10;
		}
		
		System.out.println("The sum of the digits for "+n+" is : "+sum);
		
		sc.close();
	}

}
