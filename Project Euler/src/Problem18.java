import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Problem18 {

	private static BufferedReader stdin;
	private static ArrayList<int[]> triangle;
	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p18.txt"));
	
		readInput();
		calculate();
	}
	public static void calculate(){
		ArrayList<int[]> addedTriangle = new ArrayList<int[]>();
		addedTriangle.add(triangle.get(0));
		int[]k = new int[2];
		k[0]=triangle.get(0)[0]+triangle.get(1)[0];
		k[1]=triangle.get(0)[0]+triangle.get(1)[1];
		addedTriangle.add(k);
		
		for (int i = 2; i <triangle.size() ; i++) {
			int[] a = addedTriangle.get(i-1);
			int[] b = triangle.get(i);
			int[] c = new int[b.length];
			for (int j = 0; j < c.length; j++) {
				if(j==0){
					c[j]=a[j]+b[j];
				}else if(j==c.length-1){
					c[c.length-1]=a[j-1]+b[c.length-1];
				}else{
					if(a[j-1]+b[j]>a[j]+b[j]){
						c[j]=a[j-1]+b[j];
					}else{
						c[j]=a[j]+b[j];
					}
				}
			}
			addedTriangle.add(c);
	
		}
		print(addedTriangle);
		int max =0;
		int [] f = addedTriangle.get(addedTriangle.size()-1);
		for (int i = 0; i < f.length; i++) {
			if(f[i]>max){
				max = f[i];
			}
		}
		System.out.println(max);
		
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
		int c = 0;
		while(true){
			String b = stdin.readLine();
			if(b==null){
				break;
			}
			String[] d= b.split(" ");
			int data[]= new int[d.length];
			for (int i = 0; i < d.length; i++) {
				data[i]=Integer.parseInt(d[i]);
			}
			triangle.add(data);
			c++;

		}

	}
}
