
public class TwentyOne {
	
	
	public static int calcD(int num){
		int targ=num/2;
		int sum=0;
		for(int i=1;i<=targ;i++){
			if(num%i==0)
				sum+=i;
			
		}
		return sum;
		
	}
	
	public static boolean isAmicable(int num){
		if(calcD(calcD(num))==num)
			return true;
		else
			return false;
	}
	
	
	public static void main(String args[]){
		int sum=0;
		
		//System.out.println(calcD(284));
		for(int i=1;i<10000;i++){
			if(isAmicable(i)&& i!=calcD(i)){
				//System.out.println(i);
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
