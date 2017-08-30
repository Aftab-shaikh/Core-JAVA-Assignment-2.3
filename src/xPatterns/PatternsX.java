package xPatterns;

/*
 * this class is to print X pattern
 */

public class PatternsX {
	
	public static void main(String[] args) {
		
		 for (int a = 1; a<=5; a++)
	        {
	            for (int b=1; b<=5; b++)
	            {
	                if (a == b)
	                  System.out.print("*");
	                if (a == 1 && b == 5)
	                  System.out.print("*");
	                if (a == 2 && b == 4)
	                 System.out.print("*");
	                if ( a == 4 && b == 2)
	                 System.out.print("*");
	                if (a == 5 && b == 1)
	                 System.out.print("*");
	                else
	                  System.out.print("_"); 
	                     
	            }System.out.println(); 
	        }
	}

}
