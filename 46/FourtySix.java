import java.util.ArrayList;


public class FourtySix {
	
	public static boolean isOk(int num){	
		ArrayList<Triangle> arr = new ArrayList<Triangle>();
		
		for(int i=1;i<=100;i++){
			//System.out.println(i);
			int toCheck=(int) (num-2*Math.pow(i,2));
			if(isPrime(toCheck))
				return true;
		}
		return false;
	}
	
	public static boolean contains(ArrayList<Triangle> arr,Triangle tr){
		
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).isSame(tr))
				return true;
		}
		return false;
		
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

	public static void main(String args[]){
		int num=0;
		for(int i=9;;i+=2){
			if(!isPrime(i)){
				
				if(isOk(i)){
					System.out.println(i);
					
				}
				else{
					num=i;
					break;
				}
			}
		}
	
		System.out.println("number is: "+num);
		
	}

}
