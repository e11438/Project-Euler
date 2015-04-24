
public class Thirty {
	public static long sumOfPow(long num,int pow){
		String numStr=Long.toString(num);
		char[] numArray = numStr.toCharArray();
		long sum=0;
		for(int i=0;i<numArray.length;i++){
			sum+=Math.pow(Long.parseLong(numArray[i]+""),pow);
			
		}
		
		return sum;		
	}
	
	public static boolean isValid(long num,int pow){
		if(sumOfPow(num,pow)>num)
			return false;
		else
			return true;		
	}
	
	public static long downLimit(int pow){
		long val=0;
		long count=2;
		while(true){
			val=sumOfPow(count,pow);
			
			if(val==count)	break;	
			count++;
		}
		return count;
	}
	
	public static void main(String args[]){
		System.out.println(downLimit(5));
		/*
		for(long i=1634;i<8209;i++){
			long val=sumOfPow(i,4);
			if(val>i) System.out.println(i+"\t"+val);
		}
		*/
		long it=downLimit(5);
		long sum=0;
		while(it<10000000){
			System.out.println(it);
			long val = sumOfPow(it,5);
			if(it==val)
				sum+=val;
			
			it++;
		}
		
		System.out.println(sum);
	}
	
	

}
