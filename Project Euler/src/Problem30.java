import java.util.ArrayList;


public class Problem30 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String a;
		for (int i = 2; i < 1000000; i++) {
			a=i+"";
			long sum=0;
			for (int j = 0; j < a.length(); j++) {
				char c=a.charAt(j);
				int summen=Integer.parseInt(c+"");
				for (int k = 0; k < 4; k++) {
					summen*=Integer.parseInt(c+"");
				}
				sum+=summen;
				
			}
			if(sum==i){
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		long sum=0;
		for (int i = 0; i < numbers.size(); i++) {
			sum+=numbers.get(i);
		}
		
		System.out.println(sum);
	}
}
