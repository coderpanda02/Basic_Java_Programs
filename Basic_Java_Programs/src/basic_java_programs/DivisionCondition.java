package basic_java_programs;

public class DivisionCondition {

	public static void main(String[] args) {
		
		   int n=1;
	       int count=0;
	       
	       //printing 1st 5 numbers divided by 2, 3 and 5 together
	       
	       while(count<5){   
	    	   
	    	   if(n%2==0 && n%3==0 && n%5==0) {
	    		   System.out.print(n+" ");
	    		   count++;
	    	   }
	    	   n++;
	       }
	}

}
