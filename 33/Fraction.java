
public class Fraction {
	public int numerator;
	public int denominator;
	public boolean isSimplified;
	
	public Fraction(int num1,int num2,boolean flag){
		numerator=num1;
		denominator=num2;
		isSimplified=flag;
	}
	
	private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
 
	public boolean isSame(Fraction fraction){
		int gcd=findGCD(fraction.numerator,fraction.denominator);
		int gcd2=findGCD(numerator,denominator);
		if(fraction.denominator!=0&&denominator!=0&&gcd!=1){
			 //throw new IllegalArgumentException("Argument 'divisor' is 0");
			if(numerator/gcd2==fraction.numerator/gcd&&denominator/gcd2==fraction.denominator/gcd){
				return true;
			}
			else
				return false;
		}
		else
			return false;
	}
	
	public boolean isSimped(){
		return isSimplified;
	}
	
	public boolean isLessThanOne(){
		if(numerator<denominator)
			return true;
		else
			return false;
	}

}
