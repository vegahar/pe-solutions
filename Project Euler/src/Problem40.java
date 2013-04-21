import java.util.ArrayList;


public class Problem40 {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 1000000; i++) {
			sb.append(i);
		}
		ArrayList<Character> list = new ArrayList<Character>();
		list.add(sb.charAt(1));
		list.add(sb.charAt(10));
		list.add(sb.charAt(100));
		list.add(sb.charAt(1000));
		list.add(sb.charAt(10000));
		list.add(sb.charAt(100000));
		list.add(sb.charAt(1000000));
		long sum = 1;
		for (Character character : list) {
			sum *= Integer.parseInt(character+"");
		}
		System.out.println(sum);
	}
	
	
}
