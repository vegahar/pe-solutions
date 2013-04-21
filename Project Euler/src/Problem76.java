

public class Problem76 {

	public static void main(String[] args) {

		int n = 100;
		int values[] = new int[n-1];
		for (int i = 0; i < values.length; i++) {
			values[i] = i+1;
		}
		int table[] = new int[n+1];
		table[0]=1;
		for(int i=0; i<values.length; i++){
			for(int j=values[i]; j<=n; j++){
				table[j] += table[j-values[i]];
			}
		}
		
		System.out.println(table[table.length-1]);
	}
	
}
