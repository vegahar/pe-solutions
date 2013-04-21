
public class Problem14 {

	public static void main(String[] args) {
		int longest=0;
		int number=0;
		
		for (int i = 1000000; i > 0; i--) {
			long a = i;
			int counter =0;
			while (true) {
				if (a%2==0) {
					a/=2;
				}else {
					a = 3*a+1;
				}
				counter++;
				if (a==1) {
					counter++;
					break;
					
				}
				
			}

			
			if (counter > longest) {
				longest = counter;
				number=i;
			}
		}
		System.out.println(longest + " " + number);
	}
}
