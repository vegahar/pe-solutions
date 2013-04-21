import java.util.ArrayList;
import java.util.TreeSet;


public class Problem44 {

	public static void main(String[] args) {
		long number = 100000;
		TreeSet<Long> tree = new TreeSet<Long>();
		for (int i = 1; i <number; i++) {
			tree.add(numbersPentagonal(i));
		}
		Long[] array = new Long[tree.size()];
		array = tree.toArray(array);

		long D =Long.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				long a = array[i]+array[j];
				long b =Math.abs(array[i]- array[j]);
				
				if(tree.contains(a) && tree.contains(b)){
					
					if(D > Math.abs(array[i]+ array[j])){
						D = Math.abs(array[i]- array[j]);
						System.out.println(D);
					}
				}
			}
			
		}
		System.out.println(D);
		
	}
	public static long numbersPentagonal(long n){

		return ((3*n*n)-n)/2;
	}
}
