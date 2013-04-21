import java.math.BigInteger;


public class Problem25 {
	public static void main(String[] args) {
		int fibonacciNumber = 2;
		BigInteger f1 = new BigInteger("1");
		BigInteger f2 = new BigInteger("1");
		while(true){
			BigInteger tall= f1.add(f2);
			fibonacciNumber++;
			if(tall.toString().length()==1000){
				break;
			}
			f1=f2;
			f2=tall;	
		}
		System.out.println(fibonacciNumber);
	}
}
