import java.math.BigInteger;


public class FourtyEight {
	
	public static BigInteger pow(int base, int exp){      
		BigInteger one =new BigInteger("1");
		BigInteger bigBase =new BigInteger(Integer.toString(base));
		
	    if(exp ==0){
	        return one;
	    }
	    if(exp ==1){
	        return bigBase;
	    }

	    if(exp % 2 == 0){
	        BigInteger half = pow(base, exp/2);
	        return half.multiply(half);
	    }else{
	        BigInteger half = pow(base, (exp -1)/2);
	        return (half.multiply(half)).multiply(new BigInteger(Integer.toString(base)));
	    }       
	}
	
	public static void main(String args[]){
		int size=1000;
		BigInteger sum =new BigInteger("0");
		
		
		
		for(int i=1;i<=size;i++){
			sum=sum.add(pow(i,i));
			
		}
		String strNum=sum.toString();
		System.out.println(strNum.substring(strNum.length()-10, strNum.length()));
		
	}

}
