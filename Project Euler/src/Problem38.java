import java.util.ArrayList;


public class Problem38 {

	
	public static void main(String[] args) {
		long highest=0;
		for (long i = 1; i < 100000000l; i++) {
			ArrayList<Long> products= new ArrayList<Long>();
			for (long j = 1; j < 10; j++) {
				products.add(i*j);
			}
			StringBuilder sb = new StringBuilder();
			for (Long long1 : products) {
				sb.append(long1);
				if(sb.length() >=9){
					break;
				}
			}
			String string = sb.toString();
			if(string.length()==9 && products.size()>=1){
				if(PrimeNumbers.pandigital(string)){
					
					highest=i;
					
					System.out.println(highest+ " " + string);
				}
			}
			
		}
		System.out.println(highest);
	}
	
	
}
