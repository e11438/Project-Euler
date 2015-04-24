import java.math.BigInteger;


public class Twenty {
	
	
	
	public static void main(String args[]){
		
		BigInteger fact=new BigInteger("1");
		BigInteger count=new BigInteger("1");
		BigInteger one=new BigInteger("1");
		long sum=0;
		for(;count.compareTo(new BigInteger("101"))<0;count=count.add(one)){
			//System.out.println(count);
			
			fact=fact.multiply(count);
			
			
		}
		
		String strNum=fact.toString();
		
		//System.out.println(strNum);
		char[] numbers=strNum.toCharArray();
		for(int i=0;i<numbers.length;i++){
			
			sum+=Long.parseLong(numbers[i]+"");
		}
		
		System.out.println(sum);
	}

}
