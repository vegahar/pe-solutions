import java.util.ArrayList;
import java.util.Iterator;




public class Problem10 {
	
	public static void main(String[] args) {	
		ArrayList<Long> integers = new ArrayList<Long>();
		integers.add(3l);
		long c = 1000l;
		long sum = 2;
		boolean b;
		for (long i = 3; i < c; i+=2) {
			b = true;
			for (long a : integers) {
				long n= i%a;
				if(n==0){
					break;
				}
			}
			if (b) {
				integers.add(i);
				sum += i;
			}
			System.out.println(i);
			
			
		}
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < integers.size(); i++) {
			a.append(integers.get(i)+"");
		}
		System.out.println(a.toString());
		System.out.println(sum);
		
		
	}
	
	
}
