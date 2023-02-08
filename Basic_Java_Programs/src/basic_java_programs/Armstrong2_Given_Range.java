package basic_java_programs;

import java.util.Scanner;

//Armstrong numbers between (100 - 10000) -> 153, 370, 371, 407, 1634, 8208, 9474

public class Armstrong2_Given_Range {
	
	private static int Check_Armstrong(int num) {
		
		int n = num;
		int power = 0;
		
		while(n!=0) {
			n = n/10;
			power++;
		}
		
		n = num;
		int res = 0;
		while(n!=0) {
			
//			int sum = 1;
			int rem = n % 10;
			
//			for(int i=0; i<power; i++) {
//				sum = sum * rem;
//			}
			
			int sum = (int) Math.pow(rem, power);
			res = res + sum;
			n = n/10;
			
		}
		
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower and upper value for the range : ");
		
		int low = sc.nextInt();
		int high = sc.nextInt();
		
		System.out.println();
		System.out.println("Armstrong Numbers Between Range ("+low+" - "+high+") are : ");

		boolean flag = false;
		
		for(int i = low; i<= high; i++) {
			
			int result = Check_Armstrong(i);
			
			if(result == i) {
				System.out.print(i+" ");
				flag = true;
			}

		}
		
		if(!flag) {
			System.out.println("No Armstrong Numbers Present Within This Range!");
		}

		
		sc.close();
	}
	
	
}
