import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.List;


public class PrimeNumbers {
	

	
	public static boolean pandigital(int i ){
		
		String b = i+""; 
		int [] a = new int[b.length()];
		
		for (int j = 0; j < b.length(); j++) {
			char c =b.charAt(j);
			if(c == '0'){
				return false;
			}
			int k = c-49;
			if(k >= a.length){
				return false;
			}
			a[k]++;
		}
		for (int j = 0; j < a.length; j++) {
			if(a[j]!=1){
				return false;
			}
		}
		return true;
	}
	public static boolean pandigital(String i){
		
		int [] a = new int[i.length()];
		
		for (int j = 0; j < i.length(); j++) {
			char c =i.charAt(j);
			if(c == '0'){
				return false;
			}
			int k = c-49;
			if(k >= a.length){
				return false;
			}
			a[k]++;
		}
		for (int j = 0; j < a.length; j++) {
			if(a[j]!=1){
				return false;
			}
		}
		return true;
	}
	public static HashSet<Integer> getPrimeNumber(int a){
		boolean[] primes = new boolean[a];
		for (int i = 0; i < primes.length; i++) {
			primes[i]=true;
		}
		primes[0]=false;
		primes[1]=false;

		for (int i = 2; i < a/2; i++) {
			if (primes[i]) {
				for (int j = 2*i; j < a; j+=i) {
					primes[j]=false;
				}
			}
		}

		HashSet<Integer> primeNumbers = new HashSet<Integer>();
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				primeNumbers.add(i);
			}
		}

		return primeNumbers;
	}
	
	public static ArrayList<Integer> getPrimeNumbers(int a){

		boolean[] primes = new boolean[a];
		for (int i = 0; i < primes.length; i++) {
			primes[i]=true;
		}
		primes[0]=false;
		primes[1]=false;

		for (int i = 2; i < a/2; i++) {
			if (primes[i]) {
				for (int j = 2*i; j < a; j+=i) {
					primes[j]=false;
				}
			}
		}

		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				primeNumbers.add(i);
			}
		}

		return primeNumbers;
	}

	public static ArrayList<Integer> getPrimeNumbersInterval(int a,int b){
		ArrayList<Integer> c = PrimeNumbers.getPrimeNumbers(b);

		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (Integer integer : c) {
			if(integer>=a && integer <b){
				primes.add(integer);
			}
		}
		return primes;
	}


	public static boolean permutationOfEachOther(int a, int b){
		String c = a+"";
		String d = b+"";
		if(c.length() != d.length()){
			return false;
		}
		int [] numberC = new int[10];
		int [] numberD = new int[10];
		for (int i = 0; i < c.length(); i++) {
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


	public static ArrayList<Integer> trialDivision(int n){
		 ArrayList<Integer> primes = getPrimeNumbers(1000000);

		ArrayList<Integer> primesInNumber = new ArrayList<Integer>();

		for (Integer integer : primes) {
			if (integer*integer > n) {
				break;
			}
			while(n% integer == 0){		
				primesInNumber.add(integer);
				n/=integer;
			}
		}
		if(n>1){
			primesInNumber.add(n);
		}
		return primesInNumber;
	}
	
	public static ArrayList<Integer> uniqueTrialDivision(int n){
		 ArrayList<Integer> primes = getPrimeNumbers(1000000);

		ArrayList<Integer> primesInNumber = new ArrayList<Integer>();

		for (Integer integer : primes) {
			if (integer*integer > n) {
				break;
			}
			while(n% integer == 0){
				if(!primesInNumber.contains(integer)){					
					primesInNumber.add(integer);
				}
				n/=integer;
			}
		}
		if(n>1){
			primesInNumber.add(n);
		}
		return primesInNumber;
	}
	
	public static int[] getNextPermutation(int[]values){

		int N = values.length;
		
		int i = N-1;
		while(values[i-1]>=values[i]){
			i--;
			if(i<1){
				break;
			}
		}
		int j =N;
		if (i-1 < 0) {
			return null;
		}
		while(values[j-1]<=values[i-1]){
			j--;
			if(j<2){
				break;
			}
		}
		int temp=values[i-1];
		values[i-1]=values[j-1];
		values[j-1]=temp;
		i++;
		j=N;
		while(i<j){
			int temp1=values[i-1];
			values[i-1]=values[j-1];
			values[j-1]=temp1;
			i++;
			j--;
		}
		return values;
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		ArrayList<Integer> sieve = (ArrayList<Integer>) Sieve.sieve_of_eratosthenes(100000000);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(sieve.size());
		System.out.println(sieve);
		
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
 
    public static List<Integer> sieve_of_eratosthenes(int max)
    {
        Sieve sieve = new Sieve(max + 1); // +1 to include max itself
        for (int i = 3; i*i <= max; i+=2) {
            if (sieve.is_composite(i))
                continue;
 
            // We increment by 2*i to skip even multiples of i
            for (int multiple_i = i*i; multiple_i <= max; multiple_i += 2*i)
                sieve.set_composite(multiple_i);
 
        }
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= max; i += 2)
            if (!sieve.is_composite(i))
                primes.add(i);
        return primes;
    }
}