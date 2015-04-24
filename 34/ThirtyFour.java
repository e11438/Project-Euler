import java.math.BigInteger;


public class ThirtyFour {
	
	public static int[] toArr(BigInteger num){
		 String temp = num.toString();
		 int[] newGuess = new int[temp.length()];
		 for (int i = 0; i < temp.length(); i++)
		 {
			 newGuess[i] = temp.charAt(i) - '0';
		 }
	 
		 return newGuess;
	 }

	
	public static BigInteger fact(int num){
		
		BigInteger fact = BigInteger.valueOf(1);
	    for (int i = 1; i <= num; i++)
	        fact = fact.multiply(BigInteger.valueOf(i));
	    
	    return fact;
	}
	
	public static BigInteger[] toFactArray(int[] array){
		BigInteger[] result = new BigInteger[array.length];
		
		for(int i=0;i<array.length;i++){
			result[i]=fact(array[i]);			
		}
		return result;		
	}
	
	public static BigInteger elementSum(BigInteger[] array){
		BigInteger sum = new BigInteger("0");
		for(int i=0;i<array.length;i++){
			sum=sum.add(array[i]);
		}
		return sum;		
	}
	public static BigInteger sumOfFactOfNumbers(BigInteger num){
		BigInteger[] factArray = toFactArray(toArr(num));
		return elementSum(factArray);
	}
	
	public static void main(String args[]){
		BigInteger sum= new BigInteger("0");
		BigInteger one= new BigInteger("1");
		BigInteger i= new BigInteger("0");
		BigInteger limit= new BigInteger("10000000");
		BigInteger test= new BigInteger("145");
		
		System.out.println(sumOfFactOfNumbers(test));
		System.out.println(test.compareTo(sumOfFactOfNumbers(test)));
		
		for(;i.compareTo(limit)<0;i=i.add(one)){
			
			if(i.compareTo(sumOfFactOfNumbers(i))==0)
				sum=sum.add(i);
		}
		
		System.out.println(sum);
		
		
		
	}

}
