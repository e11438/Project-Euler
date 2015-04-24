import java.util.ArrayList;
import java.util.Arrays;


public class Thirty9 {
	
	
	public static int numOfSol(int num){	
		ArrayList<Triangle> arr = new ArrayList<Triangle>();
		for(int i=3;i<=num/2;i++){
			//System.out.println(i);
			for(int j=4;num-i-4>j;j++){
				if(!contains(arr,new Triangle(i,j,num-i-j))){
					if(new Triangle(i,j,num-i-j).isRight())
						arr.add(new Triangle(i,j,num-i-j));
				}
				if(j>=(num-i-j)||j+1==(num-i-j))
					break;
			}
			
		}
		return arr.size();
	}
	
	public static boolean contains(ArrayList<Triangle> arr,Triangle tr){
		
		for(int i=0;i<arr.size();i++){
			if(arr.get(i).isSame(tr))
				return true;
		}
		return false;
		
	}
	
	public static void main(String args[]){
		int max=0;
		int p=0;
		
		System.out.println(numOfSol(120));
		
		for(int i=12;i<1001;i++){
			if(numOfSol(i)>max){
				max=numOfSol(i);
				
				p=i;
				System.out.println(max+" "+p);
			}
			
		}
		System.out.println(p);
		
	}

}
