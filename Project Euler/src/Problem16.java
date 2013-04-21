import java.math.BigInteger;


public class Problem16 {
	
	public static void main(String[] args) {
		BigInteger number = new BigInteger("2");
		for (int i = 0; i < 999; i++) {
			number = number.multiply(new BigInteger("2"));
		}
		String a = number.toString();
		System.out.println(a);
		long sum=0;
		for (int i = 0; i < a.length(); i++) {
			int b = (int)a.charAt(i)-48;
			sum+= b;
		}
		System.out.println(sum);
	}
	
}
