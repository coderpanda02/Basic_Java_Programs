package basic_java_programs;

import java.util.Scanner;

//	Palindrome String -> A string which is the same while being read forward and backward.  
//	an empty string is also a palindrome, since it reads the same forward and backward.
//	every single character string is also considered to be a palindrome.

public class Palindrome_String {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String str = sc.next();
		String reverse = "";
		boolean flag = false;
		
		for(int i = str.length()-1; i>=0; i--) {
				reverse = reverse + str.charAt(i);
			}
		
				
		if(str.equalsIgnoreCase(reverse)) {
			flag = true;
		}
		
		if(flag) {
			System.out.println(str+" is a palindrome string.");
		}
		else {
			System.out.println(str+" is not a palindrome string.");
		}
		sc.close();
	}

}
