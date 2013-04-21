
public class Problem6 {
	public static void main(String[] args) {
		int sumSq = 0;
		int sqSum = 0;
		
		for (int i = 1; i <=100; i++) {
			sumSq += i*i;
			sqSum += i;
		}
		System.out.println(sumSq);
		System.out.println(sqSum*sqSum);
		System.out.println((sqSum*sqSum)-sumSq);
	}
}
