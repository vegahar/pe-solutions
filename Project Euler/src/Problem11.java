import java.io.BufferedReader;
import java.io.FileReader;


import java.util.StringTokenizer;


public class Problem11 {

	static BufferedReader stdin;
	static StringTokenizer st = new StringTokenizer("");
	private static int[][] matrix;
	public static void main(String[] args) throws Exception {
		stdin =  new BufferedReader(new FileReader("input/p11.txt"));
		
		readInput();

		//		for (int i = 0; i < a.length; i++) {
		//			for (int j = 0; j < a[0].length; j++) {
		//				System.out.print(format.format(a[i][j]) + " ");
		//			}
		//			System.out.println();
		//		}
		long high=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				long d= calculate(i, j);
				if(d>high){
					high=d;
				}
			}
		}
		System.out.println(high);
	}
	public static long calculate(int a, int b){

		long sum[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		//mot høyre
		for (int i = b; i <b+3; i++) {
			if(i==matrix[0].length){
				break;
			}
			sum[0]*=matrix[a][i];
		}

		//mot venstre
		for (int i = b; i >=b-3; i--) {
			if(i<0){
				break;
			}
			sum[1]*=matrix[a][i];
		}

		//nedover
		for (int i = a; i <a+3; i++) {
			if(i==matrix.length){
				break;
			}
			sum[2]*=matrix[i][b];
		}

		//oppover
		for (int i = a; i >=a-3; i--) {
			if(i<0){
				break;
			}
			sum[3]*=matrix[i][b];
		}


		//høyre nedover
		for (int i = 0; i <4; i++) {
			if(a+i==matrix.length || b+i ==matrix[0].length){
				break;
			}
			sum[4]*=matrix[a+i][b+i];
		}
		
		//venstre nedover
		for (int i = 0; i <4; i++) {
			if(a+i==matrix.length || b-i <0){
				break;
			}
			sum[5]*=matrix[a+i][b-i];
		}
		
		//høyre oppover
		for (int i = 0; i <4; i++) {
			if(a-i<0|| b+i ==matrix[0].length){
				break;
			}
			sum[6]*=matrix[a-i][b+i];
		}
		
		//venstre oppover
		for (int i = 0; i <4; i++) {
			if(a-i<0|| b-i <0){
				break;
			}
			sum[7]*=matrix[a-i][b-i];
		}
		
		
		//finner max i verdi og retunerer.
		long max=0;
		for (int i = 0; i < sum.length; i++) {
			if(sum[i]>max){
				max=sum[i];
			}
		}
		return max;

	}

	public static void readInput() throws Exception {
		matrix = new int[20][20];
		int c = 0;
		while(true){
			String b = stdin.readLine();
			if(b==null){
				break;
			}
			String[] d= b.split(" ");
			for (int i = 0; i < d.length; i++) {
				matrix[c][i]= Integer.parseInt(d[i]);
			}
			c++;

		}

	}

}
