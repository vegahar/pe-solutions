

public class Problem3 {

	public static void main(String[] args) {
		long c = 600851475143l;
		for (long i = 3; i <= c; i+=2) {
			if (c% i == 0) {
				System.out.println(i);
				c = c/i;
			}else if (c == i) {
				System.out.println(c);
				break;
			} 
		}
		
	}
}
