
public class FourtyFour {
	
	 public static boolean binarySearch(int key,int[] data,int size) 
	    {
	         int low = 0;
	         int high = size - 1;
	          
	         while(high >= low) {
	             int middle = (low + high) / 2;
	             if(data[middle] == key) {
	                 return true;
	             }
	             if(data[middle] < key) {
	                 low = middle + 1;
	             }
	             if(data[middle] > key) {
	                 high = middle - 1;
	             }
	        }
	        return false;
	   }

	 public static void main (String args[]){
		 int max=0;
		 int min=1000000;
		 int[] pentArray = new int[5000];
		 
		 int[] data ={4,5,6,7,8,9,1,2,3,4,5,67,87,4};
		 
		 for(int i=1;i<=pentArray.length;i++){
			 pentArray[i-1]=i*(3*i-1)/2;
		 }
		 /*for(int i=0;i<pentArray.length;i++){
			 System.out.println(pentArray[i]);
		 }*/
		 
		 //System.out.println(pentArray[0]);
		 
		 for(int i=0;i<pentArray.length;i++){
			 
			 for(int j=i+1;j<pentArray.length;j++){
				 int sum=pentArray[i]+pentArray[j];
				 if(sum>max)
					 max=sum;
				 int diff=pentArray[j]-pentArray[i];
				//System.out.println(sum+ " "+diff);
				 
				 if(binarySearch(sum,pentArray,pentArray.length)){
					 
					 if(binarySearch(diff,pentArray,pentArray.length)){
						 System.out.println("elaz");
						System.out.println(diff);
						 
						 if(min>diff){
							 //System.out.println(pentArray[j]+" "+pentArray[i]);
							 min=diff;
						 }
					 }
				 }
			 }
		 }
/*		 int sum=92;
		 int diff=92;
		 
		 if(binarySearch(sum,pentArray,pentArray.length)){
			 if(binarySearch(diff,pentArray,pentArray.length))
				 if(min>diff){
					 System.out.println("elazzz");
					 min=diff;
				 }
		 }
		 
		 System.out.println(binarySearch(sum,pentArray,pentArray.length));*/
	 }
}
