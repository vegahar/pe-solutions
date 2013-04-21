import java.util.ArrayList;


public class Problem24 {
	public static int[] getNext(int[]values){

		int N = values.length;
		
		int i = N-1;
		while(values[i-1]>=values[i]){
			i--;
			if(i<1){
				break;
			}
		}
		int j =N;
		while(values[j-1]<=values[i-1]){
			j--;
			if(j<2){
				break;
			}
		}
		int temp=values[i-1];
		values[i-1]=values[j-1];
		values[j-1]=temp;
		i++;
		j=N;
		while(i<j){
			int temp1=values[i-1];
			values[i-1]=values[j-1];
			values[j-1]=temp1;
			i++;
			j--;
		}
		return values;
	}
	public static void main(String[] args) {
		int[] values = {0,1,2,3,4,5,6,7,8,9	
		};
		int []a=null;
		for (int i = 1; i <1000000; i++) {
			a = getNext(values);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	
	}
}
