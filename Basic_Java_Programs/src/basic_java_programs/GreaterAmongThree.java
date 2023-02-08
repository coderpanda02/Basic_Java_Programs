package basic_java_programs;

import java.util.Scanner;

public class GreaterAmongThree {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers : ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
				
		if(a>b) {
			
			if(a>c) 
				System.out.println(a+" is greater among the three numbers");
			else 
				System.out.println(c+" is greater among the three numbers");
		}
		else {
			if(b>c)
				System.out.println(b+" is greater among the three numbers");
			else
				System.out.println(c+" is greater among the three numbers");
		}
		
		sc.close();
	}

}
