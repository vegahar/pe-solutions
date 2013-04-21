import java.util.ArrayList;


public class Problem35 {
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = PrimeNumbers.getPrimeNumbers(999999);
		ArrayList<Integer> circularPrimes = new ArrayList<Integer>();
		String a;
		int count =0;
		int i=0;
		while(i<primes.size()){
			a=primes.get(i)+"";
			ArrayList<String> rotation = new ArrayList<String>();
			rotation.add(a);
			for (int j = 1; j < a.length(); j++) {
				a = a.substring(1)+a.charAt(0);
				rotation.add(a);
			}
			boolean allPrimes=false;
			for (String string : rotation) {
				int k =Integer.parseInt(string);
				if(primes.contains(k)){
					allPrimes=true;
				}
				else{
					allPrimes=false;
					break;
				}
			}
			if (allPrimes) {
				for (String string : rotation) {
					int b = Integer.parseInt(string);
					if (primes.contains(b)) {
						primes.remove(primes.indexOf(b));
						circularPrimes.add(b);
					}
					
				}
				System.out.println(rotation);
			}
			else{
				i++;
			}
		}
		System.out.println(circularPrimes);
		System.out.println(circularPrimes.size());
	}
}
