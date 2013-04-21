import java.sql.Date;
import java.text.DecimalFormat;


public class Problem28 {
	
	private static int[][] spiral;
	private static int x=1;
	private static int y=0;
	private static int dirX=1;
	private static int dirY=0;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int size=11;
		int value = size*size;
		spiral= new int[size][size];
		spiral[0][0]=value;
		value--;
		fillspiral(value);
		printSpiral();
		System.out.println(calculateSum());
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	public static long calculateSum(){
		long sum =-1;
		int y1 = 0;
		int y2 =spiral.length-1;
		for (int i = 0; i < spiral.length; i++) {
			sum+= spiral[y1][i];
			sum+= spiral[y2][i];
			y2--;
			y1++;
		}
		
		return sum;
		
	}
	public static boolean isInsideBoard(int x, int y){
		if((y >= 0 && y < spiral.length) && (x >=0 && x < spiral.length)){
				return true;		
		}
		return false;
	}
	public static void fillspiral(int value){

		while(value>=1){
			if (spiral[dirY][dirX]==0) {					
				spiral[dirY][dirX]=value;
				value--;
			}
			else if(spiral[dirY][dirX]!=0){
				changeDirection();
			}
			dirX+=x;
			dirY+=y;
			if (!isInsideBoard(dirX, dirY)) {
				changeDirection();
				dirX+=x;
				dirY+=y;
			}
			
		}
	}
	public static void changeDirection(){
		if(x==1 && y ==0){
			x=0;
			y=1;
			dirX--;
			return;
		}
		if(x==0 && y ==1){
			x=-1;
			y=0;
			dirY--;
			return;
		}
		if(x==-1 && y ==0){
			x=0;
			y=-1;
			dirX++;
			return;
		}
		if(x==0 && y ==-1){
			x=1;
			y=0;
			dirY++;
			return;
		}
		
	}
	public static void printSpiral(){
		DecimalFormat format = new DecimalFormat("00");
		for (int i = 0; i < spiral.length; i++) {
			for (int j = 0; j < spiral.length; j++) {
				System.out.print(format.format(spiral[i][j])+ " ");
			}
			System.out.println();
		}
	}
}
