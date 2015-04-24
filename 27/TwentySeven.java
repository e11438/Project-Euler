import java.math.BigInteger;


public class TwentySeven {
	
	
	public static boolean isPrime(long n) {
		int i;
		if (n==1) return false; 
		for (i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int numOfPrimes(int a,int b){
		int count=0;
		
		BigInteger number=BigInteger.valueOf(0);
		
		while(true){
			number=((BigInteger.valueOf(count).pow(2)).add(BigInteger.valueOf(count).multiply(BigInteger.valueOf(a)))).add(BigInteger.valueOf(b));
			if(isPrime(number.longValue())&&(number.longValue()>0)){
				count++;
			}
			else{				
				break;	
			}
			
		}			
		return count;
	}
	
	public static void main(String args[]){
		BigInteger count=null;
		
		long max=0,product=0;
		
		
		
		// System.out.println(isPrime(1));
		 //System.out.println(isPrime(11));
		
		for (int a=-999;a<1000;a++){
			System.out.println(a);
			for (int b=-999;b<1000;b++){				
				
				if(numOfPrimes(a,b)>max){
					max=numOfPrimes(a,b);
					product=a*b;
				}
			}			
		}
		
		System.out.println(product);
	}

}
