import java.util.ArrayList;


public class Problem37 {
	public static void main(String[] args) {
		ArrayList<Integer> primeNumbers = PrimeNumbers.getPrimeNumbers(10000000);
		int sum=0;
		int count =0;
		for (int i = 4; i < primeNumbers.size(); i++) {
			int a = primeNumbers.get(i);
			int lastDigit=a%10;
			int firstDigit=Integer.parseInt((""+a).charAt(0)+"");
			if(lastDigit == 1|| lastDigit == 4|| lastDigit == 6|| 
					lastDigit == 8|| lastDigit == 9|| 
					firstDigit == 1|| firstDigit == 4||
					firstDigit == 6|| firstDigit == 8|| firstDigit == 9){
				continue;
			}
			String length = a + "";
			String leftToRight = a+"";
			String rightToLeft = a+ "";
			boolean truncatableprimes=false;
			for (int j = 0; j < length.length(); j++) {
				leftToRight = leftToRight.substring(1);
				rightToLeft= rightToLeft.substring(0,rightToLeft.length()-1);
				if(leftToRight.equals("") || rightToLeft.equals("")){
					break;
				}
				if(leftToRight.charAt(0)=='0' || rightToLeft.charAt(0)=='0'){
					truncatableprimes= false;
					break;
				}
				if(primeNumbers.contains(Integer.parseInt(leftToRight)) && 
						primeNumbers.contains(Integer.parseInt(rightToLeft)) ){
					truncatableprimes = true;
				}
				else{
					truncatableprimes= false;
					break;
				}
			}
			if(truncatableprimes){
				System.out.println(a);
				count++;
				sum+=a;
			}
			
		}
		System.out.println(sum + " "+ count);
	}
}
