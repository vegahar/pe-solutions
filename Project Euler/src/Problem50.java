import java.util.ArrayList;


public class Problem50 {

	public static void main(String[] args) {
		int length=1000000;
		ArrayList<Integer> primes = PrimeNumbers.getPrimeNumbers(length);
		int sum=0;
		int count =0;
		int highestCount=0;
		int prime=0;
		for (int i = 0; i < Math.sqrt(primes.size()); i++) {
			count =0;
			sum=0;
			System.out.println(i);
			for (int j = i; j < primes.size(); j++) {

				if (sum + primes.get(j) <length) {
					sum+= primes.get(j);
					count++;
					if (primes.contains(sum)) {
						if(count > highestCount){
							highestCount=count;
							prime = sum;
							System.out.println(prime);
						}
					}
				}
				else {
					break;
				}
			}

	
		}
		System.out.println(primes);
		System.out.println(highestCount);
		System.out.println(prime);
	}
}
