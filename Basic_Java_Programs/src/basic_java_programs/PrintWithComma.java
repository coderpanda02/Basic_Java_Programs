package basic_java_programs;

public class PrintWithComma {

	public static void main(String[] args) {
		
		boolean flag = false;
		
		if(args.length == 0) {
			System.out.println("Please enter some values with command line argument!");
		}
		else {
			for(int i=0; i<args.length; i++) {
				
//				System.out.print(args[i]); //it prints num 1st then ',' 
				//but it will give wrong o/p for the 2nd arg,
				//as it will print arg 1st then ',' => ab, c, d instead of a, b, c, d
				
				for(int j=0; j<i; j++) {
					flag = true; //without flag it will print -> a1, a2,, a3,,,
				}
				if(flag) {
					System.out.print(", ");
				}
				
				System.out.print(args[i]);
			}
		}
		
	}

}
