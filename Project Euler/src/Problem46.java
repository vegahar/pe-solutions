import java.util.HashSet;


public class Problem46 {

	
	public static void main(String[] args) {
		
		HashSet<Integer> primes = PrimeNumbers.getPrimeNumber(1000000);
		
		for (int i = 1; i < 100; i+=2) {
			if(primes.contains(i)){
				continue;
			}
			System.out.println(i);
		}
	}
	
	
}
