import java.util.ArrayList;
import java.util.Date;


public class Problem2{
	
	
	public static void main(String[] args){
	
		int sum = 2;
		int a = 2;
		System.out.println(4*10e6);
		for (int i = 1; i <=4*10e5; i+=0) {
			int tall = a +i;
			if (tall <=4*10e6){
				if (tall % 2 == 0) {
					sum += tall;
				}
			}
			i=a;
			a=tall;
		}
		System.out.println(sum);
	}
	
	
}
