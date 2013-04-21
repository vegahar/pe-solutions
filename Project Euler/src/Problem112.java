import java.math.BigDecimal;



public class Problem112 {


	public static void main(String[] args) {
		BigDecimal number = new BigDecimal(99);
		BigDecimal power = new BigDecimal(100);
		long bouncyNumbers=0;
		long trials=99;
		for (Long i = 100L; i < 1000000000000l; i++) {
			trials++;
			if(bouncy(i)){
				bouncyNumbers++;
				BigDecimal a = new BigDecimal(bouncyNumbers);
				BigDecimal b = new BigDecimal(trials);
				try {
					a = a.multiply(power);
					a = a.divide(b);
					if(a.compareTo(number) == 0){
						System.err.println(bouncyNumbers);
						System.out.println(trials);
						System.out.println(a.floatValue());
					}
						
					
				} catch (Exception e) {
					continue;
				}
			}
			
		
		}
		
	}


	public static boolean bouncy(Long a){

		String b = a.toString();
		char [] arr = b.toCharArray();
		boolean goesUp = false;
		boolean goesDown = false;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] > arr[i]){
				goesUp = true;
			}
			else if(arr[i+1] < arr[i]){
				goesDown = true;
			}
			if(goesDown && goesUp){
				return true;
			}
		}
		return false;

	}

}
