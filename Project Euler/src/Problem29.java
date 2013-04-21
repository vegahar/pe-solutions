import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;


public class Problem29 {

	
	public static void main(String[] args) {
		
		HashSet<BigInteger> tall = new HashSet<BigInteger>();
		
		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				tall.add(new BigInteger(i+"").pow(j));
			}
		}
		
		System.out.println(tall.size());
	}
}
