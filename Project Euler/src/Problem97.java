import java.math.BigInteger;


public class Problem97 {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("2");
		BigInteger mod = new BigInteger("10000000000");
		BigInteger exp = new BigInteger("7830457");
		a= a.modPow(exp, mod).multiply(new BigInteger("28433")).add(new BigInteger("1")).mod(mod);
		System.out.println(a.toString());

		
	}
}
