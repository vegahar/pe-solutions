import java.util.ArrayList;
import java.util.List;


public class Problem39 {

	public static void main(String[] args) {
		
		int p =1000;
		int max =0;
		int n = 0;
		for (int i = 1; i <=p ; i++) {
			System.out.println(i);
			List<Integer[]> list = findNumberofPerimeters(i);
//			for (Integer[] integers : list) {
//				for (int j = 0; j < integers.length; j++) {
//					System.out.print(integers[j] + " ");
//				}
//				System.out.println();
//			}
			if(list.size()>max){
				max = list.size();
				n=i;
			}
		}
		
		System.err.println(max/2 + " " + n);
	}
	
	
	
	public static ArrayList<Integer[]> findNumberofPerimeters(int n){
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		for (int i = 1; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int j2 = j; j2 < n; j2++) {
					if(j2*j2 == j*j + i*i){
						if(j2+j+i == n){
							Integer[] a = {i,j,j2};
							list.add(a);
						}
					}
				}
			}
		}
		
		return list;
	}
}

