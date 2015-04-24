

	import java.util.Set;
	import java.util.TreeSet;

	public class FourtyThree {
		
			 public static Set<String> permute(String chars)
		  {
		    // Use sets to eliminate semantic duplicates (aab is still aab even if you switch the two 'a's)
		    // Switch to HashSet for better performance
		    Set<String> set = new TreeSet<String>();

		    // Termination condition: only 1 permutation for a string of length 1
		    if (chars.length() == 1)
		    {
		      set.add(chars);
		    }
		    else
		    {
		      // Give each character a chance to be the first in the permuted string
		      for (int i=0; i<chars.length(); i++)
		      {
		        // Remove the character at index i from the string
		        String pre = chars.substring(0, i);
		        String post = chars.substring(i+1);
		        String remaining = pre+post;

		        // Recurse to find all the permutations of the remaining chars
		        for (String permutation : permute(remaining))
		        {
		          // Concatenate the first character with the permutations of the remaining chars
		          set.add(chars.charAt(i) + permutation);
		        }
		      }
		    }
		    return set;
		  }
			 public static boolean checkDivisibility(long num){
				 int[] numArray={2,3,5,7,11,13,17};
				 String str=Long.toString(num);
				
				 for(int i=0;i+3<=str.length()&&i<numArray.length;i++){
					 
					 String subStr=str.substring(i+1,i+4);
					 //System.out.println((i+1)+ " "+(i+3)+ " "+subStr);
					 int num1 =Integer.parseInt(subStr);
					 //System.out.println(num1+" "+str);
					 if((i)<numArray.length&&!(num1%numArray[i]==0)){
						 //System.out.println(num1);
						 return false;
					 }
						 
				 }
				 return true;
			 }
		 
		 public static void main(String[] args)
		  {
			 long sum=0;
			 System.out.println(checkDivisibility(1406357289));
			 String str ="123456";
			 
			 //System.out.println(str.substring(1, 3));
		   for (String s : permute("0123456789"))
		    {
		    	if(!(s.charAt(0)=='0')){
		    		if(checkDivisibility(Long.parseLong(s))){
		    			System.out.println(s);
		    			sum+=Long.parseLong(s);
		    		}
		    	}
		    }
		   System.out.println("sum is: "+sum);
		  }

}



