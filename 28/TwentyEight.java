
public class TwentyEight {
	
	public static int calGap(int num){
		
		return num-1;
	}
	
	public static long calSum(int num){
		long sum=1;
		long val=1;
		for(int i=3;i<=num;i=i+2){
			System.out.println(i);
			int gap=calGap(i);
			int count=0;
			while(count<4){
				val+=gap;
				sum+=val;				
				count++;
			}
			
		}
		return sum;
		
	}
	
	
	public static void main(String args[]){
		
		System.out.println(calSum(1001));
		
		
	}

}
