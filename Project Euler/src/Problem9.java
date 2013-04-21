
public class Problem9 {
	public static void main(String[] args) {
		System.out.println(lol());
	}



	public static int lol (){
		for (int i = 3; i <1000; i++) {
			for (int j = i+1; j < 1000; j++) {
				for (int k = j+1; k <1000 ; k++) {
					if(i*i+j*j == k*k){
						if(i+j+k == 1000){
							return i*j*k;
						}
					}

				}
			}
		}
		return 0;
	}
}
