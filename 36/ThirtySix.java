
public class ThirtySix {
	
	public static boolean isPalindrome(String a){
		String reverse=new StringBuilder(a).reverse().toString();
		return a.equals(reverse);
	}
	
	public static boolean isOk(int test){
		String binary=Integer.toBinaryString(test);
		return isPalindrome(Integer.toString(test))&&isPalindrome(binary);			
	}
	public static void main(String[] args){
		int count=0;
		long sum=0;
	
		if(isOk(2))
			System.out.println("Ok!");
		else
			System.out.println("Not Ok!");
		
		for(int i=0;i<=1000000;i++){
			
			if(isOk(i)){
				System.out.println(i);
				count++;
				sum+=i;
			}
		}
		System.out.println(count);
		System.out.println(sum);
	}
}
