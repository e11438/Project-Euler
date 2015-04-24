import java.math.BigInteger;


public class Sixteen {
	
	
	public static void main(String args[]){
		int sum=0;
		BigInteger two=new BigInteger("2");
		BigInteger result=two.pow(1000);
		
		System.out.println(result);
		
	
		String Str=result.toString(10);
		char[] strArray=Str.toCharArray();
		
		for(int i=0;i<strArray.length;i++){
			sum+=Integer.parseInt(strArray[i]+"");
		}
		for(int i=0;i<strArray.length;i++){
			System.out.print(strArray[i]);
		}
		System.out.println();
		System.out.println(sum);
		
	}

}

