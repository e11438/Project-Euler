import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;


public class FourtyTwo {
	static ArrayList<Integer> triArray=new ArrayList<Integer>();
	public  static boolean isTri(int num){
		for(int i=0;i<triArray.size();i++){
			if(triArray.get(i)==num)
				return true;
		}
		return false;
	}
	
	public static int getNum(char letter){
		switch(letter)
	      {
	         case 'A' :
	            return 1; 	            
	         case 'B' :
	        	 return 2;
	         case 'C' :
	        	 return 3;	           
	         case 'D' :
	        	 return 4;
	         case 'E' :
	        	 return 5;	        	 
	         case 'F' :
		            return 6; 	            
		     case 'G' :
		        	 return 7;
		     case 'H' :
		        	 return 8;	           
		         case 'I' :
		        	 return 9;
		         case 'J' :
		        	 return 10;
		         case 'K' :
			            return 11; 	            
			         case 'L' :
			        	 return 12;
			         case 'M' :
			        	 return 13;	           
			         case 'N' :
			        	 return 14;
			         case 'O' :
			        	 return 15;	        	 
			         case 'P' :
				            return 16; 	            
				     case 'Q' :
				        	 return 17;
				     case 'R' :
				        	 return 18;	           
				         case 'S' :
				        	 return 19;
				         case 'T' :
				        	 return 20;
				         case 'U' :
					            return 21; 	            
					         case 'V' :
					        	 return 22;
					         case 'W' :
					        	 return 23;	           
					         case 'X' :
					        	 return 24;
					         case 'Y' :
					        	 return 25;	        	 
					        
	            	         
	         default :
	        	 return 26;
	      }
	}
	
	 
	 
	 public static int calcVal(String name){
		 
		 int sum=0;
		 char[] charName=name.toCharArray();
		 for(int i=0;i<charName.length;i++){
			 sum+=getNum(charName[i]);
		 }
		 
		return sum; 
	 }
	
	public static void main(String args[]) throws IOException{
		int tri=0;
		for(int i=1;tri<14*26;i++){
			tri=i*(i+1)/2;
			triArray.add(tri);
		}
		
			System.out.print(calcVal("SKY"));
			//triArray.add(tri);
		
		System.out.println();
		int num=0;
		int maxlength=0;
		BigInteger sum=new BigInteger("0");

		
		String fileName="p042_words.txt";
		
		try{
			ReadFile file = new ReadFile(fileName);
			String [] readLines = file.openFile();
						
			String[] namesWithCommas=readLines[0].split(",");
			
			
			for(int i=0;i<namesWithCommas.length;i++){
				namesWithCommas[i]=namesWithCommas[i].substring(1,namesWithCommas[i].length()-1);
				
				if(isTri(calcVal(namesWithCommas[i])))
					num++;
				//System.out.println(namesWithCommas[i]);
			}
			System.out.println(maxlength+" "+num);
			
			//sortStringBubble(namesWithCommas);
			
			/*for(int i=0;i<namesWithCommas.length;i++){
				//System.out.println(new BigInteger(Integer.toString(calcVal(namesWithCommas[i])*i)));
				sum=sum.add(new BigInteger(Integer.toString(calcVal(namesWithCommas[i])*(i+1))));
			}
			
			System.out.println(sum);*/
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
	}

}
