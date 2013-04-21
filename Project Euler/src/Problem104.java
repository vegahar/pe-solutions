import java.math.BigDecimal;
import java.math.BigInteger;


public class Problem104 {
	static BigDecimal PHI =BigDecimal.ONE;
	static BigDecimal sqrt5 =new BigDecimal(Math.sqrt(5));

	public static void main(String[] args) throws Exception {
		PHI = PHI.add(sqrt5);
		PHI = PHI.divide(new BigDecimal(2));
		
		BigDecimal c=BigDecimal.ONE;
		int k=3;
		while(true){
			c = fib(k);
			System.out.println(c);
			if(frontAndBackPandigital(c.toBigInteger())){
				System.err.println(k);
				break;
			}
			k++;
			if(k%1000 == 0){
				System.out.println(k);
			}
		}

	}
	
	public static BigDecimal fib(int n) throws Exception{
		BigDecimal a = PHI.pow(n);
		BigDecimal c = BigDecimal.ONE;
		c = c.subtract(PHI);
		
		BigDecimal b = c.pow(n);
		a = a.subtract(b);
		return a.divide(sqrt5);
	}
	public static boolean frontAndBackPandigital(BigInteger a){
		String b= a.toString();
		if(b.length()<9){
			return false;
		}
		if(!PrimeNumbers.pandigital(b.substring(0,9)) ){
			return false;
		}
		return PrimeNumbers.pandigital(b.substring(b.length()-9));
	}

}
