import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class Problem81 {

	private static BufferedReader stdin;
	private static ArrayList<int[]> triangle;
	
	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p81.txt"));
	
		readInput();
		print(triangle);
	}

	
	public static void print(ArrayList<int[]>b){
		DecimalFormat format = new DecimalFormat("00");
		for (int i = 0; i < b.size(); i++) {
			int []a= b.get(i);
			for (int j = 0; j < a.length; j++) {
				System.out.print(format.format(a[j])+ " ");
			}
			System.out.println();
		}
	}
	public static void readInput() throws Exception {
		triangle = new ArrayList<int[]>();
		while(true){
			String b = stdin.readLine();
			if(b==null){
				break;
			}
			String[] d= b.split(",");
			int data[]= new int[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i]=Integer.parseInt(d[i]);
			}
			triangle.add(data);

		}

	}
}
