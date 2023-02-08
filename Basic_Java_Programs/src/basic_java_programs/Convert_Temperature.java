package basic_java_programs;

import java.util.Scanner;

//	convertion from fahrenheit to celsius and vice versa
//	The relationship between temp in celsius and temp in farenheit is : 
//			C/5 = (F-32)/9

public class Convert_Temperature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in numbers : ");

		while(!sc.hasNextFloat()) {
			sc.next();
			System.out.println("Please enter temperature in numbers!");	
		}
		float temp = sc.nextFloat();
		
		char ch = 0;
		System.out.println("Enter the unit of the temperature - 'C'/'F' : ");	
		ch = sc.next().charAt(0);
		
		float c = 0, f = 0;
		
		switch(ch) {
		
		case 'C' : //converting C -> F
			f = (float) (9*temp/5)+32;
			System.out.println("Temperature in Farenheit : "+f+" F");
			break;
		
		case 'F' : //converting F -> C
			c = (float) (5*(temp-32))/9;
			System.out.println("Temperature in Celsius : "+c+" C");
			break;
		
		default : 
			System.out.println("Please enter correct temperature unit!");		
		}
			
		sc.close();
	}

}
