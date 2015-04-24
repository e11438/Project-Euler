import java.math.BigInteger;


public class Fourteen {
	
	public static BigInteger countTerms(BigInteger num){
		BigInteger numofTerms=new BigInteger("1");		
		BigInteger two=new BigInteger("2");
		BigInteger one=new BigInteger("1");
		BigInteger numtest=num;
		
		while(numtest.compareTo(one)>0){
			if(numtest.mod(two)==new BigInteger("0")){
				numtest=numtest.divide(two);
			}
			else{
				numtest=(numtest.multiply(new BigInteger("3"))).add(one);
			}
			System.out.println(numtest+"\n");
			numofTerms=numofTerms.add(one);
			
			
		}
		return numofTerms; 
	}
	
	public static void main (String args[]){
		
		BigInteger test=new BigInteger("13");		
		
		System.out.println(countTerms(test));
		
	}

}
