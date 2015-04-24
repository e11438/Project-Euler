import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class Eleven {	
	
    public static String[] readFileArray(String fileName){
    	//String fileName = "Try.java";                 // file 
		ArrayList<String> out = new ArrayList<String>();
	    
		try { 
		    FileReader fileRd = new FileReader(fileName); 
		    BufferedReader bufferRd = new BufferedReader(fileRd);
		    String line = null; 
		    while( (line = bufferRd.readLine()) != null) { 
		    	out.add(line);
		    }
		    fileRd.close();
		    bufferRd.close();
	
		} catch (FileNotFoundException x) { 
		    System.out.println("Make sure " + fileName + " is also here!");
		    System.exit(-1);
		} catch (IOException x) { 
		    System.out.println(x);
		    System.exit(-1);
		} 
		String[] bar = out.toArray(new String[out.size()]);
		return bar;
    	
    }
    
    public static void main(String args[]){
    	
    	
    	//System.out.println(Arrays.asList(readFileArray("dataSet11.txt")));
    	String[] numArray=readFileArray("dataSet11.txt");
    	
    	int[][] numberMat = new int[20][20];
    	
    	for(int i = 0; i < 20; i++){
    		String[] subArray = numArray[i].split(" ");
    		for(int j = 0; j<20; j++){
    			numberMat[i][j] = Integer.parseInt(subArray[j]);
    		}    		
    	}    	
    	//printMat(numberMat);
    	
    	long[] arr={prodDiag(numberMat),prodDiag2(numberMat),prodHor(numberMat),prodVer(numberMat)};
    	
    	System.out.println(Arrays.toString(arr));
    		System.out.print(maxOfArray(arr));    	
    }
    
    public static void printMat(int[][] mat){
    	
    	for(int i=0;i<mat.length;i++){
    		for( int j=0;j<mat[i].length;j++){
    			System.out.print(mat[i][j]+" ");
    		}
    		System.out.println();
    	}    	
    }
    
    public static long prodDiag(int[][] numberMat){
    	long sum=1;
    	long max=0;
    	for(int i=0;i<17;i++){
    			
    		for(int j=0;j<17;j++){
    			sum=1;
    			
    			int count=0;
    			while(count<4){
    				sum=sum*numberMat[i+count][j+count];
    				count++;
    			}
    			//System.out.println(sum);
    			if(max<sum)
    				max=sum;
    		}   		
    	}
    	return max;
    }
    public static long prodDiag2(int[][] numberMat){
    	long sum=1;
    	long max=0;
    	for(int i=0;i<17;i++){
    			
    		for(int j=3;j<20;j++){
    			sum=1;
    			
    			int count=0;
    			while(count<4){
    				sum=sum*numberMat[i+count][j-count];
    				count++;
    			}
    			//System.out.println(sum);
    			if(max<sum)
    				max=sum;
    		}   		
    	}
    	return max;
    }
    public static long prodHor(int[][] numberMat){
    	long sum=1;
    	long max=0;
    	for(int i=0;i<20;i++){    			
    		for(int j=0;j<17;j++){
    			sum=1;
    			
    			int count=0;
    			while(count<4){
    				sum=sum*numberMat[i][j+count];
    				count++;
    			}
    			//System.out.println(sum);
    			if(max<sum)
    				max=sum;
    		}   		
    	}
    	return max;
    }
    public static long prodVer(int[][] numberMat){
    	long sum=1;
    	long max=0;
    	for(int i=0;i<17;i++){    			
    		for(int j=0;j<20;j++){
    			sum=1;    			
    			int count=0;
    			while(count<4){
    				sum=sum*numberMat[i+count][j];
    				count++;
    			}
    			//System.out.println(sum);
    			if(max<sum)
    				max=sum;
    		}   		
    	}
    	return max;
    }
    
    public static long maxOfArray(long[] numbers){
    	   long largetst = numbers[0];
          
           for(int i=1; i< numbers.length; i++)
           {
                   if(numbers[i] > largetst)
                           largetst = numbers[i];
                   
           }     
           
           return largetst;
    }
}
