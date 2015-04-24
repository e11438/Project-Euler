
public class Fourty {
	
	public static int numOfInt(int num){
		return Integer.toString(num).length();
	}
	
	
	
	public static void main(String args[]){
		
		String str ="";
		//System.out.println(Integer.MAX_VALUE);
		for(int i=1;i<200000;i++){
			System.out.println(i);
			str+=Integer.toString(i);
		}
		System.out.println(str.length());
		System.out.println(Integer.parseInt(str.charAt(0)+"")*Integer.parseInt(str.charAt(9)+"")*Integer.parseInt(str.charAt(99)+"")*Integer.parseInt(str.charAt(999)+"")*Integer.parseInt(str.charAt(9999)+"")*Integer.parseInt(str.charAt(99999)+"")*Integer.parseInt(str.charAt(999999)+""));
	}

}
