import java.util.ArrayList;
import java.util.HashSet;


public class Problem45 {

	
	public static void main(String[] args) {
		
		HashSet<Long> tri = new HashSet<Long>();
		HashSet<Long> pen = new HashSet<Long>();
		HashSet<Long> hex = new HashSet<Long>();
		
		for (int i = 285; i <100000; i++) {
			tri.add(triangle(i));
		}
		for (int i = 165; i <100000; i++) {
			pen.add(pentagonal(i));
		}
		for (int i = 143; i <100000; i++) {
			hex.add(hexagonal(i));
		}
		
		for (Long longen : tri) {
			if(pen.contains(longen) && hex.contains(longen)){
				System.out.println(longen);
			}
		}
			
	}
	
	
		
	public static long triangle(long i){
		return (i*(i+1))/2;
	}
	public static long pentagonal(long i){
		return (i*((3*i)-1))/2;
	}
	public static long hexagonal(long i){
		return (i*(2*i-1));
	}
}
