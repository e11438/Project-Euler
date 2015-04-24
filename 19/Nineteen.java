
public class Nineteen {
	
	
	public static int giveNextFirstDay(int daysForMonth,int firstDay){
		
		if(daysForMonth==28){
			
			return firstDay;
		}
		else if(daysForMonth==29){
			if(firstDay+1>7)
				return ((firstDay+1)%7);
			else	
				return firstDay+1;
			
		}
			
		else if(daysForMonth==30){
			if(firstDay+2>7){
				return (firstDay+2)%7;
			}
			else
				return firstDay+2;
		}
			
		else {
			if(firstDay+3>7)
				return (firstDay+3)%7;
			else
				return firstDay+3;
		}
			
			
	}
	
	public static int daysForMonth(int month,boolean leapFlag){
		if(month==9||month==4||month==6||month==11)
			return 30;
		else if(month==2){
			if(leapFlag){
				return 29;
			}
			else
				return 28;
			
		}
		else
			return 31;
		
	}
	
	public static boolean isLeap(int year){
		
		if(year%100==0){
			if(year%400==0)
				return true;
			else
				return false;
		}
		else{
			if(year%4==0)
				return true;
			else
				return false;										
		}
		
	}
	
	public static void main(String args[]){
		
		int numOfSundays=0,firstDay=1;
		//boolean leapFlag=false;
		//System.out.println(giveNextFirstDay(31,3));
		for(int i=1;i<=12;i++){
			
			firstDay=giveNextFirstDay(daysForMonth(i,isLeap(1900)),firstDay);
			//System.out.println(firstDay);
		}
		System.out.println(firstDay);
		for(int year=1901;year<=2000;year++){
			for(int month=1;month<=12;month++){
				
				firstDay=giveNextFirstDay(daysForMonth(month,isLeap(year)),firstDay);
					if(firstDay==7)				
						numOfSundays++;
			}
		}
		
		System.out.println(numOfSundays);
		System.out.println(isLeap(1997));
		
	}

}
