import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;


public class Problem62 {

	
	public static void main(String[] args) {
		System.out.println(Math.cbrt(41063625));
		System.out.println(Math.cbrt(56623104));
		System.out.println(Math.cbrt(66430126));
		long n=1;
		while (true) {
			BigInteger number = new BigInteger(n+"").pow(3);
			
		}
	}
}
