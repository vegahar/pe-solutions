
public class Problem48 {
	public static void main(String[] args) {
		long sum =0;
		for (int i = 1; i < 1001; i++) {
			long a=i;
			for (int j = 1; j <i; j++) {
				a*=i;
				a%=10000000000l;
			}
			sum+=a;
			sum%=10000000000l;
		}
		System.out.println(sum);
	}
}
