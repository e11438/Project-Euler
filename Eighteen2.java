import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Eighteen2 {
	
	public static ArrayList<String> readFile() throws IOException{
		ArrayList<String> result = new ArrayList<String> ();
		// Simple way to read file without Reversing
				FileReader logReader = new FileReader("/Users/Weerasooriya/Documents/prob18.txt");
		        BufferedReader buffer = new BufferedReader(logReader);
		     
		        for (String line1 = buffer.readLine(); line1 != null; line1 = buffer.readLine()) {
		            result.add(line1);
		        }
		        
		        return result;
	}
	
	public static ArrayList[] toArrayListArray(ArrayList<String> array) {
		
		ArrayList[] result=new ArrayList[array.size()];
		for(int i=0;i<array.size();i++){
			result[i]=toArrayList(array.get(i));		
						
		}
		return result;		
	}
	public static ArrayList<Integer> toArrayList(String str){
		String[] strNum = str.split(" ");
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<strNum.length;i++){			
			result.add(Integer.parseInt(strNum[i]));
		}
		return result;		
	}
	
	public static void printArrayListArray(ArrayList[] result){
		
		for(int i=0;i<result.length;i++){		
			
			for(int j=0;j<result[i].size();j++){
				System.out.print(result[i].get(j)+" ");				
			}
			System.out.println();			
		}
		
	}
	
	
	
	public static void main(String args[]) throws IOException{
		
		ArrayList[] ret=toArrayListArray(readFile());
		printArrayListArray(ret);
		
	}

}
