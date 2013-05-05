public class Problem92 {

	
	public static void main(String[] args) {
		int count89=0;
		int n =10000000;
		int [] nextNumber = new int[n];
		for (int i = 0; i < nextNumber.length; i++) {
			nextNumber[i] = nextInt(i);
		}
		
		for (int i = 1; i < n; i++) {
			int end = i;
			while(true){
				end = nextNumber[end];
				if(end==89){
					count89++;
					break;
				}else if(end == 1){
					break;
				}
			}
		}
		
		System.out.println(count89);
	}
	
	
	
	public static int nextInt(int n){
		String a = n+"";
		int number = 0;
		
		for (int i = 0; i < a.length(); i++) {
			int b = Integer.parseInt(a.charAt(i)+"");
			number += b*b;
		}
		
		return number;
	}
	
	
}
