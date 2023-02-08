package basic_java_programs;

public class Armstrong1 {
	
	public static void main(String[] args) {

		int num = 1634;
		int n,count = 0;
		n = num;
		
		while(n != 0) {
			n = n/10;
			count++;
		}
		
		n = num;
		int result = 0;
		while(n != 0){
			int sum = 1, rem;
			rem = n%10;
			for(int i = 0; i<count; i++) {
				sum = sum*rem;
			}
			result = result + sum;
			n = n/10;
		}
		if(num == result) {
			System.out.println(num+" is an armstrong number");
		}
		else {
			System.out.println(num+" is not an armstrong number");
		}
		
	}
}
