import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Problem42 {

	static BufferedReader stdin;
	static StringTokenizer st = new StringTokenizer("");
	private static String[] input;
	
	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p42.txt"));		
		readInput();
		ArrayList<Integer> triangleNumbers = new ArrayList<Integer>();
		
		for (int i = 1; i < 2000; i++) {
			triangleNumbers.add(numbersTriangle(i));
		}
		int count=0;
		for (int i = 0; i < input.length; i++) {
			String word = input[i];
			int sum =0;
			for (int j = 0; j < word.length(); j++) {
				sum+=(word.charAt(j)-64);
			}
			if(triangleNumbers.contains(sum)){
				count++;
			}
		}
		
		System.out.println(count);

	}
	public static int numbersTriangle(int n){

		return ((n*n)+n)/2;
	}

	public static void readInput() throws Exception {
			String b = stdin.readLine();
			b = b.replace('"', ' ');
			b=b.trim();
			input= b.split(" , ");
	}
}
