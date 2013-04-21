
public class Problem36 {
	public static void main(String[] args) {
		long sum =0;
		for (int i = 0; i < 1000000; i++) {
			if (isBase10And2Palindrome(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isBase10And2Palindrome(int n){
		String base10 = n +"";
		String base2 = Integer.toBinaryString(n);

		if(isPalindrome(base2)&&isPalindrome(base10)){
			return true;
		}
		return false;
	}
	public static boolean isPalindrome(String a){
		if(a.charAt(0)=='0' || a.charAt(a.length()-1)=='0'){
			return false;
		}
		int b =0;
		int c = a.length()-1;
		while(c>=b){
			if(!(a.charAt(b)==a.charAt(c))){
				return false;
			}
			b++;
			c--;
		}
		
		return true;
	}
	
}
