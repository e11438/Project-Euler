import java.math.BigInteger;


public class Seventeen {
//==========================================================================	
	public static BigInteger countCharsTwo(char numChar1,char numChar2){
						
		int num1=Integer.parseInt(numChar1+"");
		int num2=Integer.parseInt(numChar2+"");
		if(num1==0 && num2==0){
			return new BigInteger("0");
		}
		if(num1==0)
			return countCharsOne(num2).add(new BigInteger("3"));
		else if(num2==0){
			if(num1==5||num1==6||num1==4)
		      
		            return new BigInteger("8");	
			else if(num1==2||num1==3||num1==8||num1==9)
		     
		        	return new BigInteger("9"); 
			else if(num1==1)
			        return new BigInteger("6");	
			else
		        	return new BigInteger("10");
		      
			
		}
		else if(num1==1){
			if(num2==1||num2==2)
				return (new BigInteger("9"));
			else if(num2==3||num2==4||num2==9||num2==8)
				return (new BigInteger("11"));
			else if(num2==7)
				return (new BigInteger("12"));
			else
				return (new BigInteger("10"));
		
		}
		else{
			
			if(num1==5||num1==6||num1==4)
		            return (new BigInteger("8")).add(countCharsOne(num2));	            
			else if(num1==2||num1==3||num1==8||num1==9)
		        	return (new BigInteger("9")).add(countCharsOne(num2)); 
			else if(num1==1)
			        return (new BigInteger("6")).add(countCharsOne(num2));	
			else
		        	return (new BigInteger("10")).add(countCharsOne(num2));
		      			
		}
		
	}
//================================================================================	
	public static BigInteger countCharsOne(int num){
		//char[] atrAr=num.toCharArray();
		
		 if(num==1||num==2||num==6)
	               
	            return new BigInteger("3");	            
		 else if(num==3||num==7||num==8)
	        	 return new BigInteger("5"); 	         
		 else
	        	 return new BigInteger("4");
	      
		
	}
	
//===============================================================================
	public static BigInteger countCharsThree(String num){
		
		char [] strArray=num.toCharArray();
		int num1=Integer.parseInt(strArray[0]+"");
		
		if(num1==1||num1==2||num1==6)	
			
	            return (new BigInteger("3").add(new BigInteger("7"))).add(countCharsTwo(strArray[1],strArray[2]));	            
		else if (num1==3||num1==7||num1==8)     
		
	        	 return (new BigInteger("5").add(new BigInteger("7"))).add(countCharsTwo(strArray[1],strArray[2])); 	         
		else
	        	 return (new BigInteger("4").add(new BigInteger("7"))).add(countCharsTwo(strArray[1],strArray[2]));
	      
		
	}
	public static void main (String args[]){
		BigInteger sum=new BigInteger("0");
		String strNum=null;
		for(int i=1;i<1000;i++){
			strNum=Integer.toString(i);
			if(strNum.length()==1){
				sum=sum.add(countCharsOne(i));
			}
			else if(strNum.length()==2){
				char[] newStr=strNum.toCharArray();
				sum=sum.add(countCharsTwo(newStr[0],newStr[1])).subtract(new BigInteger("3"));
			}
			else{
				sum=sum.add(countCharsThree(strNum));
			}
			
		}
		System.out.println(sum.add(new BigInteger("11")));
		
		
		System.out.println(countCharsThree("999"));
		System.out.println(countCharsThree("115"));
		
	}

}
