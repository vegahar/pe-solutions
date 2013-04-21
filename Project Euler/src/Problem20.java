import java.math.BigInteger;


public class Problem20 {
	public static void main(String[] args) {
		BigInteger sum = new BigInteger("1");
		for (int i = 2; i < 100; i++) {
			BigInteger a = new BigInteger(""+i);
			sum = sum.multiply(a);
			System.out.println(sum);
		}
		String b = sum.toString();
		System.out.println(b);
		long summen =0;
		for (int i = 0; i < b.length(); i++) {
			summen += Integer.parseInt(b.charAt(i)+"");
		}
		System.out.println(summen);
	}
}
