import java.math.BigInteger;
import java.util.ArrayList;


public class Problem53 {

	
	
	static ArrayList<BigInteger> list = new ArrayList<BigInteger>();
	public static void main(String[] args) {
		list.add(new BigInteger("0"));
		list.add(new BigInteger("1"));
		for (int i = 2; i < 101; i++) {
			list.add(list.get(i-1).multiply(new BigInteger(""+i)));
		}
		int sum =0;
		System.out.println(combination(23, 10));
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j < i; j++) {
				if(combination(i, j).toString().length() >= 7)
					sum++;
			}
		}
		System.out.println(sum);
		
		
	}
	
	
	public static BigInteger combination(int i, int j){
		BigInteger b = list.get(i);
		b = b.divide(list.get(j).multiply(list.get(i-j)));
		
		return b;
	}
}
