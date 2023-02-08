package basic_java_programs;

import java.util.Scanner;

//Magic Number : If the sum of its digits are calculated till a single digit recursively
//			   and the single digit comes out to be 1, then it is a magic number.
//			   
//			   eg :  1234 => 1+2+3+4 = 10 --> 1+0 = 1, so 1234 is a Magic Number.

public class Magic_Number {
	
	
	private static boolean findSumofDigits(int num) {
		
		int sum = 0;
		
//		boolean flag = false;
//		if(sum == 1) {
//			flag = true;
//		}
		
		int rem;
		while(num>0 || sum>9) { //runs until num is a positive number or sum is of two digit 
			
			if(num == 0) { //as num becomes 0 after one iteration of addition process, 
				num = sum; //putting the sum value in num to carry on the process
				sum = 0; // and making sum = 0 again to proceed further
			}
			
			rem = num%10;
			sum = sum + rem;
			num = num/10; //num becomes 0 when all the digits are done
		}
		
//		return flag;
		return (sum == 1); //returns true if sum is 1 otherwise false
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		int num = n;
		boolean flag = false;
		boolean singleDigit = false;
		
		if(n<10) {
			System.out.println("Please enter a number with two or more digits!");
			singleDigit = true;
		}
		else {
			flag = findSumofDigits(num);
		}
		
		if(!singleDigit){
			if(flag) {
				System.out.println(n+" is a Magic number.");
			}
			else {
				System.out.println(n+" is not a Magic number.");
			}	
		}
		
		sc.close();
	}

}
