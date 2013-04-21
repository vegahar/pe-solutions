import java.util.HashSet;



public class Problem145 {

	static HashSet<Character> settavdritt = new HashSet<Character>();
	
	public static void main(String[] args) {
		settavdritt.add('0');
		settavdritt.add('2');
		settavdritt.add('4');
		settavdritt.add('6');
		settavdritt.add('8');
		long start = System.currentTimeMillis();
		long sum =0;
		long n = 1000000000;
		for (long i = 1; i < n; i++) {
			if(i%1000000==0)
				System.out.println(i);
			if(i%10==0)
				continue;
			
			long revers = reversible(i);
			if(revers != -1 ){
				long tall = revers + i;
				if(tall%2==0){
					continue;
				}
				if(onlyodddigits(tall)){
					sum++;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println(end-start);
	}
	
	
	public static long reversible(long n){
		
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		StringBuilder sb1 = sb.reverse();
		return sb1.capacity() == sb.capacity() ? Long.parseLong(sb1.toString()) : -1;
		
		
	}
	
	public static boolean onlyodddigits(long n){
		
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		String b = sb.toString();
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if(settavdritt.contains(c))
				return false;
		}
		return true;
	}
	
}
