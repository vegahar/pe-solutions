import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;


public class Problem22 {

	private static BufferedReader stdin;
	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p22.txt"));
	
		readInput();
	}
	public static void readInput() throws Exception {
	
	
		String a = stdin.readLine();
		String [] b= a.split(",");
		for (int i = 0; i < b.length; i++) {
			b[i]=b[i].replace('"', ' ').trim();
			
		}
		Arrays.sort(b);

		BigInteger tallet = new BigInteger("0");
		for (int i = 0; i < b.length; i++) {
			String string = b[i];
			int sum=0;
			for (int j = 0; j < string.length(); j++) {
				sum+=string.charAt(j)-64;
			}
			sum*=(i+1);
			
			tallet = tallet.add(new BigInteger(sum+""));
		}
		
		System.out.println(tallet.toString());
	}
}
