import java.util.HashSet;


public class ThirtyThree {
	
	 
	 public static boolean isTrivial(int num1,int num2){
		 String strNum1=Integer.toString(num1);
		 String strNum2=Integer.toString(num2);
		 
		 String secondNum1=strNum1.substring(1);
		 String secondNum2=strNum2.substring(1);
		 
		 if (Integer.parseInt(secondNum1)==0&&Integer.parseInt(secondNum2)==0)
			 return true;
		 else
			 return false;
	 }
	 
	 public static Fraction simplify(Fraction fract){
		 //Fraction result=null;
		 if(fract.numerator==fract.denominator)
			 return fract;
		 String strNum1=Integer.toString(fract.numerator);
		 String strNum2=Integer.toString(fract.denominator);
		 
		 int remove=findCommon(toIntArray(strNum1),toIntArray(strNum2));
		 if(remove==0)
			 return fract;
		 else
			 return new Fraction(remNum(strNum1,remove),remNum(strNum2,remove),true);
		 
	 }
	 
	 
	 public static int remNum(String number,int rem){
		 if(Integer.parseInt(number.charAt(0)+"")==rem)
			 return Integer.parseInt(number.charAt(1)+"");
		 else
			 return Integer.parseInt(number.charAt(0)+"");
		 
	 }
	 
	 //-----------------------------------------------------------
	 public static int[] toIntArray(String temp){
	 
		 int[] newGuess = new int[temp.length()];
		 for (int i = 0; i < temp.length(); i++)
		 {
			 newGuess[i] = temp.charAt(i) - '0';
		 }
	 
		 return newGuess;
	 }
	 //-----------------------------------------------------------------
	 
	 //if this function returns zero it means two arrays have not same elements
	 //or same element is 0
	 public static int findCommon( int[ ] arrayOne, int[ ] arrayTwo ) {
		 	int result=0;
	    	int[ ] arrayToHash;
	    	int[ ] arrayToSearch;

	    	if( arrayOne.length < arrayTwo.length ) {
	    		arrayToHash = arrayOne;
	    		arrayToSearch = arrayTwo;
	    	} else {
	    		arrayToHash = arrayTwo;
	    		arrayToSearch = arrayOne;
	    	}

	        HashSet<Integer> hashedArray = new HashSet<Integer>( );
	        for( Integer entry : arrayToHash ) {
	            hashedArray.add( entry );
	        }
	        

	        for( Integer entry : arrayToSearch ) {
	            if( hashedArray.contains( entry ) ) {
	                result=  entry ;
	            }
	        }	        
			return result;
	        //return intersection.toArray( new Integer[ 0 ] );
	 }
	
	        
	        
	public static void main(String args[]){
		int count=0;
		long mulNum=1;
		long mulDen=1;
		
		Fraction startFrac= null;
		Fraction afterSimp= null;
		
//		System.out.println(findGCD(100,23));
//		System.out.println(remNum("34",6));
//		System.out.println(isTrivial(20,35));
		
		for(int i=10;i<100;i++){
			for(int j=10;j<100;j++){
				startFrac=new Fraction(i,j,false);
				
				afterSimp=simplify(startFrac);
				
				if(afterSimp.isSimped()&&afterSimp.isSame(startFrac)&&startFrac.isLessThanOne()){
					count++;
					 mulNum*=i;
					 mulDen*=j;
					System.out.println(i+"  "+j);
					System.out.println(mulNum+"  "+mulDen);
				}
					
			}			
		}
		
		System.out.println(count);
		System.out.println(mulDen+"   "+mulNum);
		System.out.println(mulDen/findGCD(mulDen,mulNum));
		
		
	}
	
	private static long findGCD(long number1, long number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }

}
