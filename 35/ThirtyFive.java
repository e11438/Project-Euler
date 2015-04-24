
public class ThirtyFive {
	
	public static String[] circularSolutions(int num){
		String[] solArray = new String[Integer.toString(num).length()];
		
		solArray[0]=Integer.toString(num);
		for(int i=1;i<solArray.length;i++){
			String strNum =solArray[i-1];
			String toReplace = strNum.substring(1)+strNum.substring(0, 1);
			solArray[i]=toReplace;
		}
		return solArray;
		
	}
	
	public static void printArray( String[] inputArray )
	   {
	      // Display array elements              
	         for ( String element : inputArray ){        
	            System.out.print( element+" ");
	         }
	         System.out.println();
	    }
	
	static boolean isPrime(int n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
	public static boolean isAllPrime(String[] array){
		
		for(int i=0;i<array.length;i++){
			if(!isPrime(Integer.parseInt(array[i])))
				return false;
		}
		return true;		
	}
	
	public static void main(String args[]){
		int count=0;
		isAllPrime(circularSolutions(197));
		//System.out.println(isAllPrime(circularSolutions(997103)));
		printArray(circularSolutions(997103));
		for(int i=2;i<1000001;i++){
			
			if(isPrime(i)){
				
				if(isAllPrime(circularSolutions(i))){
					System.out.println(i);
					count++;
				}
					
			}
		}
		
		System.out.println(count);
	}
	
	
}
