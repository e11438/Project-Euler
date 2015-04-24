
public class ThirtySeven {
	
	public static int[] remFromLeft(int num){
		String strNum= Integer.toString(num);
		int[] result = new int[strNum.length()];
		for(int i=0;i<result.length;i++){
			result[i]=Integer.parseInt(strNum.substring(i, strNum.length()));
		}
		return result;
	}
	
	public static int[] remFromRight(int num){
		String strNum= Integer.toString(num);
		int[] result = new int[strNum.length()];
		for(int i=0;i<result.length;i++){
			result[i]=Integer.parseInt(strNum.substring(0, strNum.length()-i));
		}
		return result;
	}
	public static void printArray(int[] a){
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+ " ");
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
	public static boolean allIsPrime(int[] a){
		for(int el:a){
			if(!isPrime(el))
				return false;
		}
		return true;
	}
	public static boolean isOk(int num){
		return allIsPrime(remFromLeft(num))&&allIsPrime(remFromRight(num));
	}
	public static void main(String[] args){
		int name=12345;
		System.out.println(isOk(3797));
		int count=0;
		int sum=0;
		
		for(int i=11;count<11;i++){
			if(isPrime(i)){
				if(isOk(i)){
					System.out.println(i);
					count++;
					sum+=i;
				}
			}
		}
		System.out.println(sum+"  "+count);		
	}

}
