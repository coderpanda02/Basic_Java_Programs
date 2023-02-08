package basic_java_programs;

import java.util.Scanner;

public class SortAlphabetically {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of characters to print : ");
		int n = sc.nextInt();
		char[] chars = new char[n];
		
		System.out.println("Enter the characters : ");		
		for(int i=0; i<n; i++) {
			chars[i] = sc.next().charAt(0);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(chars[i] > chars[j]) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		
		System.out.println("The characters after sorting alphabetically : ");
		for(char c:chars) {
			System.out.print(c+" ");
		}
		
		sc.close();

	}

}
