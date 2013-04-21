import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;


public class Problem77 {



	public static void main(String[] args) {

		int n = 100;
		ArrayList primes= PrimeNumbers.getPrimeNumbers(1000000);
		Integer values[] = new Integer[primes.size()];
		primes.toArray(values);
		
		int table[] = new int[n+1];
		
		table[0]=1;
		for(int i=0; i<values.length; i++){
			for(int j=values[i]; j<=n; j++){
				table[j] += table[j-values[i]];
			}
		}
		for (int i = 0; i < table.length; i++) {
			if(table[i] >= 5000){
				System.out.println(i);
				break;
			}
		}
		System.out.println(table[table.length-1]);
	}
	
}
