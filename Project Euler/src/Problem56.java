import java.math.BigInteger;



public class Problem56 {

	
	public static void main(String[] args) {
		
		long maximumsum=0;
		
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				BigInteger pow = new BigInteger(""+i).pow(j);
				String number = pow.toString();
				long sum=0;
				for (int k = 0; k < number.length(); k++) {
					sum+= Integer.parseInt(number.charAt(k)+"");
				}
				if(sum > maximumsum){
					maximumsum=sum;
				}
				
			}
		}
		System.out.println(maximumsum);
	
	}
}
