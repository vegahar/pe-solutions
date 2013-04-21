import java.util.ArrayList;


public class Problem23 {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		boolean[] abundantNumbers = new boolean[28123];

		for (int i = 0; i < abundantNumbers.length; i++) {
			ArrayList<Integer> divisors = new ArrayList<Integer>();
			for (int j = 1; j < i; j++) {
				if(i%j==0){
					divisors.add(j);
				}
			}
			
			int sum =0;
			for (int j = 0; j < divisors.size(); j++) {
				sum+=divisors.get(j);
			}
			if(sum>i){
				
				abundantNumbers[i]=true;
			}
		}
		ArrayList<Integer> abNumbers = new ArrayList<Integer>();
		
		for (int i = 0; i < abundantNumbers.length; i++) {
			if(abundantNumbers[i]){
				abNumbers.add(i);
			}
		}

	
		boolean [] numbers = new boolean[28123];
		for (int i = 0; i < abNumbers.size(); i++) {
			
			
			for (int j = 0; j < abNumbers.size(); j++) {
				int tall = abNumbers.get(i)+abNumbers.get(j);
				if(tall <28123){
					numbers[tall]=true;
				}
			}
		}
		
		long sum =0;
		for (int i = 0; i < numbers.length; i++) {
			if (!numbers[i]) {
				sum+=i;
			}		
		}
		System.out.println(sum);
		long end = System.currentTimeMillis();
		
	}
	
}
