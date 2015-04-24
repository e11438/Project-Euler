
public class ThirtyEight {
	
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
	
	public static void main(String args[]){
		long max=0;
		
		for(int i=9;i<49400;i++){
			int prod=0;
			String conOfProd="";
			int count = 1;
			while(conOfProd.length()<10){
				prod = i*count++;
				conOfProd+=Integer.toString(prod);
				if(conOfProd.length()==9)
					break;
			}
			if (isPan(conOfProd)){
				if(Long.parseLong(conOfProd)>max)
					max=Integer.parseInt(conOfProd);
				System.out.println(conOfProd);
			}
		}
		
	}

}
