package basic_java_programs;

import java.util.Scanner;

//	In case of LCM of an array, using GCD method doesn't work

public class LCM3_ArrayofNumbers {
	
	private static int calculateLCM(int lcm1, int b) { 
		
		if(lcm1==0 || b==0) {
			return 0;
		}
		
		int lcm = lcm1; //lcm = (a>b?a:b) step not required as largest already been found
		
		while(lcm>0) {
			
			if(lcm%lcm1 == 0 && lcm%b == 0) {
				break;
			}
			lcm++;
		}
		
		return lcm;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array : ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter the array elements to calculate LCM :");
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
				
//		finding largest in array, assign lcm = largest
		
		int largest = arr[0];
		for(int i=1; i<len; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}

		int lcm =largest;
		for(int i=0; i<len; i++) {
			lcm = calculateLCM(lcm, arr[i]);
		}
		
		System.out.println("LCM for the array is : "+lcm);

				
		sc.close();
		
	}

}
