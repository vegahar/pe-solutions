
public class Problem7 {
	
	public static void main(String[] args) {
		int primeNumber = 0;
		int number = 0;
		int i =2;
		while (true) {
			int j;
			for ( j = 2; j <= i; j++) {
				int n= i%j;
				if(n==0){
					break;
				}
			}
			if (j==i) {
				primeNumber++;
				number = j;
			}
			System.out.println(number + " er primtall nr: " + primeNumber);

			
			if(primeNumber == 10001){
				break;
			}
			i++;
		}
		
		System.out.println(number);
		
	}
}
