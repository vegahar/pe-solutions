
public class Problem43 {

	public static void main(String[] args) {
		int[] values = {0,1,2,3,4,5,6,7,8,9	
		};
		int []a=null;
		long sum=0;
		for (int i = 1; i <40000000; i++) {
			a = PrimeNumbers.getNextPermutation(values);
			if(a == null){
				break;
			}
			String string = "";
			for (int j = 0; j < a.length; j++) {
				string +=a[j];
			}
			long b = Long.parseLong(string);
			if(pandigitalProperties(b)){
				sum+=b;
			}
		}
		System.out.println(sum);

	}
	public static boolean pandigitalProperties(long a){
		String streng = a+"";
		if(!(Integer.parseInt(streng.substring(1,4))%2==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(2,5))%3==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(3,6))%5==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(4,7))%7==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(5,8))%11==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(6,9))%13==0)){
			return false;
		}
		if(!(Integer.parseInt(streng.substring(7))%17==0)){
			return false;
		}
		
		return true;
	}
}
