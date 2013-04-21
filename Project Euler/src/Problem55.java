import java.math.BigInteger;


public class Problem55 {

	
	public static void main(String[] args) {
		
		
		int count=0;
		for (int i = 10; i < 10000; i++) {
			
			if(islychrel(new BigInteger(i+""))){
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	public static boolean islychrel(BigInteger input){
		BigInteger reversed = reversed(input);
		input = reversed.add(input);
		
		int iterations = 0;
		iterations++;
		while(iterations <= 50){
			if (isPalindromic(input)) {
				return false;
			}
			reversed = reversed(input);
			input = reversed.add(input);
			iterations++;
			
		}
		return true;
	}
	
	public static boolean isPalindromic(BigInteger input){
		String a = input.toString();
		int i =0;
		int j= a.length()-1;
		while(i <=j){
			if(a.charAt(i)!=a.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	
	public static BigInteger reversed(BigInteger input){
		BigInteger reversedNum=BigInteger.ZERO;
		BigInteger a = BigInteger.ZERO;
		while (!input.equals(a)) {
			BigInteger b = reversedNum.multiply(new BigInteger("10"));
			BigInteger c  = input.mod(new BigInteger("10"));
			reversedNum = b.add(c);
			input = input.divide(new BigInteger("10"));   
		}
		return reversedNum;
		
	}
}
