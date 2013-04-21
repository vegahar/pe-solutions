
public class Problem5 {
	public static void main(String[] args) {
		int a =1;
		boolean c = false;
		while (true) {
			for (int i = 1; i <= 20; i++) {
				if(a % i==0){
					c= true;
				}else {
					c= false;
					break;
				}
			}
			if (c) {
				System.out.println(a);
				break;
			}
			a++;
		}
		
	}
}
