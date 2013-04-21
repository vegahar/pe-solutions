import java.sql.Time;
import java.util.ArrayList;



public class Problem47 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int divisors=4;
		ArrayList<Integer> first = PrimeNumbers.uniqueTrialDivision(2);
		ArrayList<Integer> second = PrimeNumbers.uniqueTrialDivision(3);
		ArrayList<Integer> third= PrimeNumbers.uniqueTrialDivision(4);
		ArrayList<Integer> fourth;
		for (int i = 5; i < 1000000; i++) {
			fourth = PrimeNumbers.uniqueTrialDivision(i);
			
			if(fourth.size() ==divisors && third.size() ==divisors 
					&& first.size() ==divisors && second.size() ==divisors){
				System.out.println(i-3);
				System.out.println(i-2);
				System.out.println(i-1);
				System.out.println(i);
				break;
			}
			
			first = second;
			second =third;
			third = fourth;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	
}
