import java.math.BigInteger;


public class TwentySevenEasy {
	
	public static void main(String[] args) {
		System.out.println(run());
	}
	
	public static boolean isPrime(long n) {
		int i;
		if (n==1) return false; 
		for (i = 2; i <= n/2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static String run() {
		int bestNum = 0;
		int bestA = 0;
		int bestB = 0;
		for (int a = -1000; a <= 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int num = numberOfConsecutivePrimesGenerated(a, b);
				if (num > bestNum) {
					bestNum = num;
					bestA = a;
					bestB = b;
				}
			}
		}
		return Integer.toString(bestA * bestB);
	}
	
	
	private static int numberOfConsecutivePrimesGenerated(int a, int b) {
		for (int i = 0; ; i++) {
			int n = i * i + i * a + b;
			if (n < 0 || !isPrime(n))
				return i;
		}
	}
	
}


