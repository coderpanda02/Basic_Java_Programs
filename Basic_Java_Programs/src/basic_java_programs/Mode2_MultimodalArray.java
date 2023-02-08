package basic_java_programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//finding mode for array with multiple modes
public class Mode2_MultimodalArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements : ");
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt(); 
		}
		
		// finding the modes
		Set<Integer> mSet = new HashSet<Integer>();
		
		int maxCount = 0;
		for(int i=0; i<n; i++) {
			
			int count = 0, maxValue = 0;
			for(int j=i+1; j<n; j++) {
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
		
		System.out.print("The Modes of the Multimodal Array are : ");
		
		Iterator<Integer> it = mSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		sc.close();
		
		
	}

}
