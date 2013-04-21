import java.util.ArrayList;


public class Problem34 {
	public static void main(String[] args) {
		int[] sumFakultet = new int[10];
		sumFakultet[0]=1;
		for (int i = 1; i < sumFakultet.length; i++) {
			sumFakultet[i]=i;
			sumFakultet[i]*=sumFakultet[i-1];
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String a;
		for (int i = 3; i < 10000000; i++) {
			a=i+"";
			long sum=0;
			for (int j = 0; j < a.length(); j++) {
				char c=a.charAt(j);
				sum+=sumFakultet[Integer.parseInt(c+"")];
				
			}
			if(sum==i){
				numbers.add(i);
			}
			
		}
		long sum=0;
		for (Integer integer : numbers) {
			sum+=integer;
		}
		System.out.println(sum);
	}
}
