import java.util.ArrayList;



public class Problem41 {
	
	public static void main(String[] args) {
		
		int n = 100000000;
		ArrayList<Integer> primes = PrimeNumbers.getPrimeNumbers(n);
		for (Integer integer : primes) {			
			if(pandigital(integer)){
				System.out.println(integer);
			}
			
			
		}
		
	}
	
	public static boolean pandigital(int i ){
		
		String b = i+""; 
		int [] a = new int[b.length()];
		
		for (int j = 0; j < b.length(); j++) {
			char c =b.charAt(j);
			if(c == '0')
				return false;
			int k = c-49;
			if(k >= a.length)
				return false;
			a[k]++;
		}
		for (int j = 0; j < a.length; j++) {
			if(a[j]!=1){
				return false;
			}
		}
		return true;
	}
}
