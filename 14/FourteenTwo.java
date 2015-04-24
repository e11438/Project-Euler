


public class FourteenTwo {
	
			
		public static long countTerms(long num){
			long numofTerms=1;
			long numTest=num;
			
			while(numTest!=1){
				if(numTest%2==0){
					numTest/=2;
				}
				else{
					numTest=numTest*3+1;
				}
				//System.out.println(numTest+"\n");
				numofTerms++;
				
				
			}
			return numofTerms; 
		}
		
		public static void main (String args[]){
			
			long max=0;	
			long numOfTerms;
			long startNum=0;
			
			//System.out.println(countTerms(test));
			
			for(long i=1;i<1000000;i++){
				System.out.println(i+"\n");
				numOfTerms=countTerms(i);
				if(numOfTerms>max){
					max=numOfTerms;
					startNum=i;
				}
			}
			System.out.println("the num is: "+startNum);
		}
}
