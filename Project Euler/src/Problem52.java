
public class Problem52 {
	
	public static void main(String[] args) {
		
		int number =Integer.MAX_VALUE;
		int one, two, three, four, five, six;
		for (int i = 1; i < 1000000000; i++){
			if(!((i+"").charAt(0)=='1')){
				continue;
			}
			one =i;
			two=2*i;
			three=3*i;
			four=4*i;
			five=5*i;
			six=6*i;
			
			if(PrimeNumbers.permutationOfEachOther(one, two)){
				if(PrimeNumbers.permutationOfEachOther(one, three)){
					if(PrimeNumbers.permutationOfEachOther(one, four)){
						if(PrimeNumbers.permutationOfEachOther(one, five)){
							if(PrimeNumbers.permutationOfEachOther(one, six)){
								if(i < number){
									number=i;
									break;
								}
								
							}
						}
					}
				}
			}
			
		}
		System.out.println(number);
	}
}
