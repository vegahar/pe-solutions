import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Problem13 {


	static BufferedReader stdin;
	static StringTokenizer st = new StringTokenizer("\n");

	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p13.txt"));

		BigInteger a =readString();
		String b = a.toString();
		String c="";
		for (int i = 0; i < 10; i++) {
			c+= b.charAt(i);
		}
		System.out.println(c);
	}

	public static BigInteger readString() throws Exception {
		String b="";
		BigInteger c = new BigInteger("0");
		while(true){
			b = stdin.readLine();
			if(b == null){
				break;
			}
			c = c.add(new BigInteger(b));
			
		}

		return c;
	}
}
