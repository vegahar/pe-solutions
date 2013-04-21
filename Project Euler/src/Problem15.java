import java.math.BigInteger;


public class Problem15 {
	
	public static void main(String[] args) {
	
		BigInteger[][] board = new BigInteger[21][21];
		
		
		for (int i = 0; i < board.length; i++) {
			board[i][0]= new BigInteger("1");
			board[0][i]=new BigInteger("1");
		}
		
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[0].length; j++) {
				board[i][j] = new BigInteger("0");
				board[i][j] = board[i][j].add(board[i-1][j].add(board[i][j-1]));
				
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j].toString()+ " ");
			}
			System.out.println();
		}
		
	}
	
}
