import java.io.IOException;
import java.math.BigInteger;


public class Thirteen {
	
	public static void main(String args[]) throws IOException{
		
		String fileName="C:/Thirteen.txt";
		
		try{
			ReadFile file = new ReadFile(fileName);
			String [] readLines = file.openFile();
			
			BigInteger sum=new BigInteger("0");
			
			StringBuffer sb = new StringBuffer("");
			for(int i=0;i<readLines.length;i++){
				System.out.println(readLines[i]);
				sum=sum.add(new BigInteger(readLines[i]));
			}
			//System.out.println(readLines.length);
			System.out.println(sum);
				
		}
		catch (IOException e){
			System.out.println(e.getMessage());
		}
		
		
		
		
	}


}
