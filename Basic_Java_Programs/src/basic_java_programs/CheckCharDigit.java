package basic_java_programs;

import java.util.Scanner;

public class CheckCharDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character to check : ");
		char ch = sc.next().charAt(0);
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
			System.out.println("The character is Alphabet.");
		}
		else if((ch>=48 && ch<=57)) {
			System.out.println("The character is Digit.");
		}
		else {
			System.out.println("The character is Special Character.");
		}
		
		
		sc.close();
	}

}
