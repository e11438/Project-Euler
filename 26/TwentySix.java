import java.math.*;
import java.lang.*;

public class TwentySix {
	//this aproach is not posible
	
	 static boolean isRecurring (int numerator, int denominator) {  
	      BigDecimal n = new BigDecimal(numerator);  
	      n.setScale(2 * denominator + 1);  
	        
	      BigDecimal d = new BigDecimal(denominator);  
	      try {  
	         n.divide(d);  
	         return false;  
	      } catch (ArithmeticException ae) {  
	         return true;  
	      }  
	   }  
	
	
	public static void main(String args[]){
	
		int scale = 1000000;
		BigDecimal num1 = new BigDecimal(1);
		BigDecimal num2 =null;
		String result =null;
		String decimal1 =null;
		//System.out.println(num1.divide(num2, scale, RoundingMode.HALF_UP).toString());
		
		
		for (int i = 2; i < 3; i++) { 
			num2=new BigDecimal(Integer.toString(i));
			
			result =num1.divide(num2, scale, RoundingMode.HALF_UP).toString();
			decimal1=result.substring(2);
	         System.out.println(decimal1);  
	      }  
		
	}
	
	
	
}
