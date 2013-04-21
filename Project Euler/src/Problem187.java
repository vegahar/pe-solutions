import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class Problem187 {
	public static void main(String[] args) {
		int primes = 100000000;
		ArrayList<Integer> primeNumbers = PrimeNumbers.getPrimeNumbers(primes);
		int count =0;
		for (int i = 0; primeNumbers.get(i) < 10000; i++) {
			int limit = 100000000 /  primeNumbers.get(i);
			for (int j = i; primeNumbers.get(j) <=limit; j++) {
				count++;
			
			}
		}
		System.out.println(count);
		
	}
}
