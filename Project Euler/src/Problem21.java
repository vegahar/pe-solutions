import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Problem21 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> amPars = new ArrayList<Integer>();
		for (int i = 0; i < 10001; i++) {
			int b = checkAmicablePair(i);
			int c = checkAmicablePair(b);
			if(b==c){
				continue;
			}
			if (c==i && b>0) {
				if(!amPars.contains(b)){
					if (!amPars.contains(i)) {
						amPars.add(i);
					}
					if (!amPars.contains(b)) {
						amPars.add(b);
					}
					
				}
			}
		}
		int sum=0;
		for (Integer integer : amPars) {
			sum+=integer;
		}
		System.out.println(amPars);
		System.out.println(sum);
	}
	public static ArrayList<Integer> getDivisors(int a){
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int j = 1; j < a; j++) {
			if(a%j==0){
				b.add(j);
			}
		}
		return b;
	}
	public static int checkAmicablePair(int a){
		int sumA =0;
		ArrayList<Integer> divisorsA = getDivisors(a);
		for (int i = 0; i < divisorsA.size(); i++) {
			sumA+=divisorsA.get(i);
		}
		
		ArrayList<Integer> divisorsB= getDivisors(sumA);
		int sumB = 0;
		
		for (int i = 0; i < divisorsB.size(); i++) {
			sumB+=divisorsB.get(i);
		}
		if(a==sumB){
			return sumA;
		}

		
		return 0;
	}
	
}
