package basic_java_programs;

import java.util.Scanner;

//finding mode for Array with only one mode
public class Mode1_SingleMode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		//finding modes
		int maxCount = 0, maxVal = 0;
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				if(count > maxCount) {
					maxCount = count;
					maxVal = arr[i];
				}
			}
		}
		
		System.out.println("Mode : "+maxVal);
		
		sc.close();
		
	}

}
