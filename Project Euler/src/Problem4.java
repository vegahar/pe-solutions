
public class Problem4 {
	public static void main(String[] args) {
		int high = 0;
		for (int i =999	; i >=100; i--) {
			for (int j =999	; j >=100; j--) {
				int a = i*j;
				String b = ""+a;
				StringBuilder c = new StringBuilder();
				for (int k = b.length()-1; k >=0; k--) {
					c.append(b.charAt(k));
				}
				if(b.equals(c.toString())){
					if(a>high){
						high= a;
					}
				}				
			}
			
		}
		System.out.println(high);
	}
}
