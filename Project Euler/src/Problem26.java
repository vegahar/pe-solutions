import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;


public class Problem26 {

	public static void main(String[] args) {
		int d=0;
		ArrayList<Integer> list = PrimeNumbers.getPrimeNumbers(1000);
		BigDecimal a = new BigDecimal(BigInteger.ONE);
		for (Integer integer : list) {
			a=  new BigDecimal(BigInteger.ONE);
			a=a.divide(new BigDecimal(integer));
			System.out.println( integer + " " + a);
		}
			
			
	}
}
