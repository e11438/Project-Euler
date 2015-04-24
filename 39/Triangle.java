
public class Triangle {
	
	int side1;
	int side2;
	int side3;
	
	public Triangle(int num1,int num2,int num3){
		int maxSide=Math.max(num1, num2);
		int minSide1=Math.min(num1, num2);
		int minSide2=Math.min(maxSide, num3);
		
		maxSide=Math.max(maxSide, num3);
		
		int min1=Math.min(minSide1, minSide2);
		int min2=Math.max(minSide1, minSide2);
		
		
		this.side1=min1;
		this.side2=min2;
		this.side3=maxSide;
	}
	public String toString(){
		return side1+" "+side2+" "+side3;
	}
	
	public boolean isSame(Triangle tr){
		if(side1==tr.side1&&side2==tr.side2&&side3==tr.side3)
			return true;
		else
			return false;
		
	}
	
	
	public boolean isRight(){
				//System.out.println(maxSide +" "+minSide1+" "+minSide2);
		if(Math.pow(side1,2)+Math.pow(side2,2)==Math.pow(side3,2))
			return true;
		
		return false;
	}

}
