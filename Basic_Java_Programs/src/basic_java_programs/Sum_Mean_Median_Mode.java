package basic_java_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/*
Mean :	Sum of the elements in array / length of the array
		
Median: Median of a sorted array of size n is defined as -
 		1. The middle element [n/2 th element], when n is odd and 
 		2. average of middle two elements [{(n/2)-1 + n/2}/2], when n is even. **
		We need to sort the array first, then apply above formula.
		
		[**as in case of array, index no. goes from 0 to n-1, so the formula becomes
			{(n/2)-1 + n/2}/2 instead of the normal mathematical formula {n/2 + (n/2)+1}/2
			
		=>	ex: if n=6 (0 - 5), then i=2nd and i=3rd number, (where i=index position)
			which is correct according to mathematical formula, i.e (1 - 6)-> 3rd and 4th number
		]

Mode : 	The number whose frequency of appearance is the most in an array.
		Sometimes there can be more than one mode.
		Having two modes is called 'bimodal', having more than that is called 'multimodal'.

There is an empirical relationship between Mean, Median, and Mode ->
		Mean – Mode = 3 [ Mean – Median ]
*/

public class Sum_Mean_Median_Mode {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the number array : ");
		int len = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = sc.nextInt();
		}
		
//		Sum -->
		int sum = 0;
		for(int i=0; i<len; i++) {
			sum += arr[i];
		}
		System.out.println("Sum : "+sum);
		
//		Mean -->
		float mean = (float)sum / len;
		System.out.println("Mean : "+mean);
		
//		Median -->
		
		Arrays.sort(arr); //sorts the array
		float median = 0;
		
		if(len%2 == 0) {
			
			int mid1 = arr[(len/2)-1]; //** ^see doc above
			int mid2 = arr[len/2];
			
			median = (float) (mid1+mid2)/2;
		}
		else {
			
			median = arr[len/2];
		}
		
		System.out.println("Median : "+median);
		
//		Mode -->
		
		Set<Integer> mSet = new HashSet<Integer>();
		
		int maxCount = 0;
		for(int i=0; i<len; i++) {
			
			int count = 0, maxValue = 0;
			for(int j = i+1; j<len; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
				if(count > maxCount) {
					maxCount = count;
					maxValue = arr[i];
					mSet.add(maxValue);
				}
				else if(count == maxCount) {
					maxValue = arr[i];
					mSet.add(maxValue);
				}
			}
		}
		
		System.out.print("Mode/Modes : ");
		
		Iterator<Integer> it = mSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		sc.close();
	}

}
