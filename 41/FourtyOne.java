import java.util.Set;
import java.util.TreeSet;


public class FourtyOne {
	
	static boolean isPrime(long n) {
	    if(n < 2) return false;
	    if(n == 2 || n == 3) return true;
	    if(n%2 == 0 || n%3 == 0) return false;
	    long sqrtN = (long)Math.sqrt(n)+1;
	    for(long i = 6L; i <= sqrtN; i += 6) {
	        if(n%(i-1) == 0 || n%(i+1) == 0) return false;
	    }
	    return true;
	}
	
	public static boolean isPan(String s1){
		//String s1=Integer.toString(num1)+Integer.toString(num2)+Integer.toString(num3);
				
		if(s1.length()==9&&!s1.contains("0")){
			if(s1.contains("1")&&s1.contains("2")&&s1.contains("3")&&s1.contains("4")&&s1.contains("5")&&s1.contains("6")&&s1.contains("7")&&s1.contains("8")&&s1.contains("9"))
				return true;
			else
				return false;
		}
		else
			return false;
		
	}
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
	 
	 public static void main(String[] args)
	  {
		 long max=0;
	    for (String s : permute("1234567"))
	    {
	    	
	    	if(isPrime(Long.parseLong(s))){
	    		
	    		max=Math.max(max, Long.parseLong(s));
	    	}
	    		
	      System.out.println(s);
	    }
	    
	    System.out.println(max);
	    
	  }

}
