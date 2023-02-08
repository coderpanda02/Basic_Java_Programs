package basic_java_programs;

import java.util.Scanner;

public class PrintEven_GivenRange {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower and upper values for range : ");
		int low = sc.nextInt();
		int high = sc.nextInt();
		boolean flag = false;
		int count = 0;
		
		System.out.println("The even numbers between "+low+" and "+high+" are : ");
		
		for(int i=low; i<=high; i++) {
			
			if(i%2 == 0) {
				count++; //count=1 -> i=2 , count=2 -> i=4,....
			}	
			
			if(i%2 == 0) {
				//count used instead of i, as i is changing even in case of odd numbers
				for(int j=0; j<count-1; j++) { //j goes 9 times (0 to 8)-> j=0, j<(10-1)
					flag = true;
				}
				if(flag) {
					System.out.print(", ");
				}
				
				System.out.print(i);
			}	
		}

		sc.close();
	}

}
