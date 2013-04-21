import java.math.BigInteger;


public class Problem12 {
	public static void main(String[] args) {
		long triangleNumber = 1;
		long firstTriangle;
		long n=1;
		while(true){
			
			int divisors = 0;
			for (int i = 1; i < Math.sqrt(triangleNumber); i++) {
				if(triangleNumber % i==0){
					divisors +=2;
				}
			}
			
			if (divisors > 500) {
				firstTriangle = triangleNumber;
				break;
			}
			n++;
			triangleNumber = ((n*n) +n)/2;
			
		}
		System.out.println(firstTriangle);
//		
	}
}
