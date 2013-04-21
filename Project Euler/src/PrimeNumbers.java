import java.util.BitSet;
import java.util.HashSet;



public class PrimeNumbers {

	
	public static HashSet<Integer> primeSet(long n){
		
		return Sieve.sieve_of_eratosthenes((int)n);
	}
	
}

class Sieve
{
    public BitSet sieve;
 
    public Sieve(int size) {
        sieve = new BitSet((size+1)/2);
    }
 
    public boolean is_composite(int k)
    {
        assert k >= 3 && (k % 2) == 1;
        return sieve.get((k-3)/2);
    }
 
    public void set_composite(int k)
    {
        assert k >= 3 && (k % 2) == 1;
        sieve.set((k-3)/2);
    }
 
    public static  HashSet<Integer> sieve_of_eratosthenes(int max)
    {
        Sieve sieve = new Sieve(max + 1); // +1 to include max itself
        for (int i = 3; i*i <= max; i += 2) {
            if (sieve.is_composite(i))
                continue;
 
            // We increment by 2*i to skip even multiples of i
            for (int multiple_i = i*i; multiple_i <= max; multiple_i += 2*i)
                sieve.set_composite(multiple_i);
 
        }
        HashSet<Integer> primes = new HashSet<Integer>();
        primes.add(2);
        for (int i = 3; i <= max; i += 2)
            if (!sieve.is_composite(i)){
                primes.add(i);
                System.out.println(i);
            }
        return primes;
    }
}