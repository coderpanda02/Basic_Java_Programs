package basic_java_programs;

public class Interest {
	
	public static void main(String[] args) {

		double p = 100, r = 4, t = 2;
		double SI = 0;
		double CI = 0;
		
		SI = (p*r*t) / 100;
		CI = p * Math.pow((1+r/100),t);
		
		System.out.println("Simple Interest: "+SI);
		System.out.println("Compound Interest: "+CI);

	}


}
