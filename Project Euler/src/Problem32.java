import java.util.HashSet;


public class Problem32 {


	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		HashSet<Long> products = new HashSet<Long>();
		for (int i = 0; i < 1000; i++) {
			for (int j = 0; j <10000; j++) {
				long sum= i *j;
				if(products.contains(sum)){
					continue;
				}
				StringBuilder sb = new StringBuilder();
				sb.append(sum);
				sb.append(i);
				sb.append(j);
				if(sb.length()==9){
					if(PrimeNumbers.pandigital(sb.toString())){
						products.add(sum);
					}
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(sum(products));
		System.out.println(end-start);
		

	}
	
	public static long sum(HashSet<Long> products){
		long sum =0;
		for (Long integer : products) {
			sum +=integer;
		}
		return sum;
		
	}
}
