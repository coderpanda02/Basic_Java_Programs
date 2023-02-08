package basic_java_programs;

//upper case to lower case & lower case to  upper case conversion of characters

public class ChangeCaseofChar {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Please enter values through command line arguments!"); 
		}
		
		if(args.length > 0) {
			
			char ch = args[0].charAt(0);
		    int temp;
		    
		    if(ch >='a' && ch <='z') {
				temp = ch;
				temp = temp-32;
				ch = (char) temp;
			}
			else if(ch >='A' && ch <='Z') {
				temp = ch;
				temp = temp + 32;
				ch = (char) temp;
			}
		    
		    System.out.print(args[0]+" -> "+ch);
		}
	
		
	}
	
}
