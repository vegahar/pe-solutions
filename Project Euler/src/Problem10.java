import java.util.ArrayList;


public class Problem10{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = PrimeNumbers.getPrimeNumbers(2000000);
		long sum =0;
		for (Integer integer : list) {
			sum+=integer;
		}
		System.out.println(sum);
	}
	
	
	
}
