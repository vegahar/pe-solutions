
public class Problem15 {

	public static void main(String[] args) {


		int n= 20;

		long mat[][] = new long[n+1][n+1];

		for (int i = 0; i < mat.length; i++) {
			mat[0][i]=1;
			mat[i][0]=1;
		}
		for (int i =1 ; i < mat.length; i++) {
			for (int j = 1; j < mat.length; j++) {
				long a = (i >=0 ? mat[i-1][j]:0);
				long b = (j >=0 ? mat[i][j-1]:0);
				mat[i][j] = a +b;
			}
		}
		System.out.println(mat[n][n]);
	}
}
;