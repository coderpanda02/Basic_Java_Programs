package basic_java_programs;

import java.util.Scanner;

//	Formula for roots of Quadratic Equation ->
//
//	if the equation is -> ax^2 + bx + c = 0, a,b,c are real numbers, i.e can't be zero  
//	Where (b^2 – 4ac) is the discriminant (d) which tells us about the nature of the roots –
//			if (b^2 – 4ac) > 0, roots are real and different
//			if (b^2 – 4ac) == 0, roots are real and equal
//			if (b^2 – 4ac) < 0, roots are complex and different
//
//	The roots are -
//		
//	i. If d>0  -->
//		x1 = (-b+Math.sqrt(d))/2a , discriminant = b*b-4*a*c
//		x2 = (-b-Math.sqrt(d))/2a , discriminant = b*b-4*a*c
//
//	ii. If d=0 -->
//		x1 = x2 = -b/2a
//
//	iii. If d<0 -->
//		x1 = -b/2a + i*(Math.sqrt(-d)/2a)) , i refers to the imaginary part 
//		x2 = -b/2a - i*(Math.sqrt(-d)/2a)) , i refers to the imaginary part
		

public class Rootsof_QuadraticEq {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three values for a, b, c : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		if(a==0 || b==0 || c==0) {
			System.out.println("Please enter numbers greater than zero!");
		}
		else {
			
			double d = b*b - 4*a*c;
			
			if(d>0) {
				
				double root1 = ((-b)+Math.sqrt(d))/(2*a);
				double root2 = ((-b)-Math.sqrt(d))/(2*a);
				System.out.println("The roots are : ");
				System.out.println("1st Root = "+root1+"\n2nd Root = "+root2);
			}
			else if(d<0) {
				
				double root_real = -b/(2*a);
				double root_img = Math.sqrt(-d)/(2*a);

				System.out.println("The roots are : ");
				System.out.println("1st Root = "+String.format("%.2f", root_real)
												+"+"+String.format("%.2f", root_img)+"i");
				System.out.println("2nd Root = "+String.format("%.2f", root_real)+"-"
												+String.format("%.2f", root_img)+"i");
			}
			
			else {
				double root = -b/(2*a);
				System.out.println("The only root is : "+root);
			}
		}
		
		sc.close();
	}

}
