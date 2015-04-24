import java.math.BigInteger;


public class FourtyFive {
	
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
	public static boolean binarySearch(BigInteger key,BigInteger[] data,int size) 
    {
         int low = 0;
         int high = size - 1;
          
         while(high >= low) {
        	 //System.out.println(high+" "+low);
        	 
        		 int middle = (low + high) / 2;
        		 //System.out.println(data[middle]);
                 if(data[middle].equals(key)) {
                     return true;
                 }
                 if(data[middle]!=null&&key!=null&&data[middle].compareTo(key)<0) {
                	 //System.out.println("elaz");
                     low = middle + 1;
                 }
                 if(data[middle]!=null&&key!=null&&data[middle].compareTo(key)>0) {
                	 //System.out.println("not elaz");
                     high = middle - 1;
                 }
        		
             
        }
        return false;
   }

	public static void main(String args[]){
		int size =1000000;
		//BigInteger size =new BigInteger(str);
		
		BigInteger[] pentArray = new BigInteger[size];
		BigInteger[] triArray = new BigInteger[size];
		BigInteger[] hexArray = new BigInteger[size];
		 
		 //int[] data ={4,5,6,7,8,9,1,2,3,4,5,67,87,4};
/*		pentArray[0]=new BigInteger("1");
		pentArray[1]=new BigInteger("2");
		pentArray[2]=new BigInteger("3");*/
		//pentArray[3]=new BigInteger("3");
		for(int i=1;i<=pentArray.length;i++){
			System.out.println(i);
			 String strI = Integer.toString(i);
			 BigInteger BI=new BigInteger(strI);
			 BigInteger one=new BigInteger("1");
			 BigInteger two=new BigInteger("2");
			 BigInteger three=new BigInteger("3");
			 pentArray[i-1]=(BI.multiply((three.multiply(BI)).subtract(one))).divide(two);
			 triArray[i-1]=(BI.multiply(BI.add(one))).divide(two);
			 hexArray[i-1]=BI.multiply((BI.multiply(two)).subtract(one));
		 }
		
		System.out.println("data Entered");	
		
		//System.out.println(pentArray[1].compareTo(pentArray[2]));
		//System.out.println(binarySearch(two1,pentArray,pentArray.length));
	 /*for(int i=0;i<size;i++){
		 	if(i<triArray.length&&i<pentArray.length&&i<hexArray.length)
			 System.out.println(triArray[i]+" "+pentArray[i]+" "+hexArray[i]);
		 
		 }*/
		 
		 
		 for(int i=0;i<size;i++){
			 //System.out.println(triArray[i]+" " );
			 
			 if(binarySearch(triArray[i],pentArray,size)){
				 if(binarySearch(triArray[i],hexArray,size)){
					 System.out.println(triArray[i]);
				 }
			 }
		 }
		
	}
	
	
}
