package basic_java_programs;

import java.util.Scanner;

public class CheckPositiveNegative {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check Positive/Negative/Zero : ");
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println(n+" is Positive.");
		}
		else if(n<0){
			System.out.println(n+" is Negative.");
		}
		else {
			System.out.println("The Number is Zero.");
		}
		
		
		sc.close();
	}

}
