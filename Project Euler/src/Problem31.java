import java.text.DecimalFormat;


public class Problem31 {


	public static void main(String[] args) {
		
		
		
		int coins[] = {1,2,5,10,20,50,100,200};
		
		int table[] = new int[201];
		table[0]=1;
		for(int i=0; i<coins.length; i++){
	        for(int j=coins[i]; j<=200; j++){
	            table[j] += table[j-coins[i]];
	        }
		}
//		DecimalFormat format = new DecimalFormat("00000");
//		for (int i = 0; i < table.length; i++) {
//			System.out.print( format.format(i) + " ");
//		}
//		System.out.println();
//		for (int i = 0; i < table.length; i++) {
//			System.out.print( format.format(table[i]) + " ");
//		}
		System.out.println(table[200]);
		
		
	}


	
	
	
	
	
	public static void latterlig(){
		
		int coins[] = {1,2,5,10,20,50,100,200};
		int combinations[][] = new int[201][coins.length];

		for (int i = 0; i < coins.length; i++) {
			combinations[0][i] = 1;
		}

		for (int i = 1; i < combinations.length; i++){
			for (int j = 0; j < coins.length; j++){
					
				int x = (i-coins[j] >= 0)? combinations[i - coins[j]][j]: 0;

				int y = (j >= 1)? combinations[i][j-1]: 0;

				combinations[i][j] = x + y;
			}
		}



		System.out.println(combinations[combinations.length-1][coins.length-1]);
	}

}
