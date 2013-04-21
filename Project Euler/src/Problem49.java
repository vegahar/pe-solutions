import java.util.ArrayList;


public class Problem49 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = PrimeNumbers.getPrimeNumbersInterval(1000, 10000);
		
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i+1; j < primes.size()-1; j++) {
				if(permutation( primes.get(i), primes.get(j) ) ){
					
					int a = primes.get(j)-primes.get(i);
					int nextPrime = primes.get(j)+a;
					if (primes.contains(nextPrime)) {
						if(permutation( primes.get(i), nextPrime )){
							System.out.println(primes.get(i)+ "" + primes.get(j)  + nextPrime);
						}
					}
				}
			}
		}
		
	}
	
	
	public static boolean permutation(int a, int b){
		String c = a+"";
		String d = b+"";
		int [] numberC = new int[10];
		int [] numberD = new int[10];
		for (int i = 0; i < 4; i++) {
			numberC[c.charAt(i)-48]++;
			numberD[d.charAt(i)-48]++;
		}
		for (int i = 0; i < numberC.length; i++) {
			if(numberC[i] != numberD[i]){
				return false;
			}
		}

		return true;
	}
}
