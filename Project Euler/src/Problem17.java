import java.util.HashMap;


public class Problem17 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> numbers = new HashMap<Integer, String>();
		
		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		
		numbers.put(10, "ten");
		numbers.put(11, "eleven");
		numbers.put(12, "twelve");
		numbers.put(13, "thirteen");
		numbers.put(14, "fourteen");
		numbers.put(15, "fifteen");
		numbers.put(16, "sixteen");
		numbers.put(17, "seventeen");
		numbers.put(18, "eighteen");
		numbers.put(19, "nineteen");
		
		numbers.put(20, "twenty");
		numbers.put(30, "thirty");
		numbers.put(40, "forty");
		numbers.put(50, "fifty");
		numbers.put(60, "sixty");
		numbers.put(70, "seventy");
		numbers.put(80, "eighty");
		numbers.put(90, "ninety");
		
		numbers.put(100, "hundred");
		numbers.put(1000, "thousand");
		
		long count =0;
		//legger til et tusen en gang
		count +=numbers.get(1000).length()+3;
		//antganger hundrer blir skrevet ut
		count +=9*numbers.get(100).length();
		count +=990*(numbers.get(100).length());
		
		//teller 1 til 9
		long count1to9=0;
		for (int i = 1; i < 10; i++) {
			count1to9 +=numbers.get(i).length();
		}
		count += count1to9*900;
		//telle 10 til 19 og ganger med 10
		long count10to19=0;
		for (int i = 10; i < 20; i++) {
			count10to19+=numbers.get(i).length();
		}
		count += count10to19*10;
		//teller antallganger melom 20 og 99
		long count20to100intens=0;
		for (int i = 20; i < 100; i++) {
			System.out.println(numbers.get(i-i%10));
			count20to100intens +=numbers.get(i-i%10).length();
		}
		System.out.println(count20to100intens);
		count+=10*count20to100intens;
		System.out.println(count);
		

	}
	
}
