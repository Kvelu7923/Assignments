package week1.day2;

public class calculator {
		
	public void additionTwoNumbers (int a,int b) {
	       int c=a+b;
	       System.out.println(c);
	}      
	public void subractionTwoNumbers (int e,int f) {
		   int g=e-f;
		   System.out.println(g);
	}
	public void multipleTwoNumbers (double i ,double j) {
		   double k=i*j;
		   System.out.println(k);
	}
	public void devideTwoNumners (float x, float y) {
		   float z=x/y;
		   System.out.println(z);
	}
	public static void main(String[] args) {
	        
		    calculator calc=new calculator();
		    calc.additionTwoNumbers(23, 54);
		    calc.subractionTwoNumbers(20, 11);
		    calc.multipleTwoNumbers(233.5, 544.33);
		    calc.devideTwoNumners(22f, 12f);
	    }
	}
