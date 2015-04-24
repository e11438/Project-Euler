import java.math.BigInteger;
import java.util.LinkedHashSet;
import java.util.Set;


public class TwentyNine {
	
	
	public static BigInteger[][] makeArray(int num){
		return new BigInteger [num][num];
	}
	
	public static void giveVals(BigInteger[][] mat,int num){
		BigInteger bigNum=new BigInteger(Integer.toString(num));
		BigInteger zero=new BigInteger("0");
		BigInteger one=new BigInteger("1");
		BigInteger two=new BigInteger("2");
		
		for (BigInteger i=zero;i.compareTo(bigNum)<0;i=i.add(one)){
			for(BigInteger j=zero;j.compareTo(bigNum)<0;j=j.add(one)){
				mat[i.intValue()][j.intValue()]=(i.add(two)).pow((j.add(two)).intValue());
				
			}
			
		}
	}
	
	
	
	public static void printArray(BigInteger[][] mat,int num){
		
		for (int i=0;i<num;i++){
			for(int j=0;j<num;j++){
				System.out.print(mat[i][j]+"  ");
				
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String args[]){
		int num=99;
		long count=0;
		BigInteger[][] array= makeArray(num);
		
		giveVals(array,num);
		
		printArray(array,num);
		
		Set<BigInteger> setUniqueNumbers = new LinkedHashSet<BigInteger>();
		
		for (int i=0;i<num;i++){
			for(int j=0;j<num;j++){				
				setUniqueNumbers.add(array[i][j]);
			}
			
		}
		
		
		for(BigInteger x : setUniqueNumbers) {
		   count++;
		}
		
		System.out.println(count);
	}

}
