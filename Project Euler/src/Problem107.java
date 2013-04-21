import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Problem107{

	static Scanner scanner;
	public static void main(String[] args) throws Exception{
		int[][] matrix= readinput();
//		printMat(matrix);
		primeAlgortime(matrix);
		
		
		
	}
	
	public static void primeAlgortime(int [][] matrix){
		//create an array with 	every vertices in it
		LinkedHashSet<Integer> notFound = new LinkedHashSet<Integer>();
		for (int i = 1; i < matrix.length; i++) {
			notFound.add(i);
		}
		//create an an integer array with max number
		
		int [] weight = new int[matrix.length];
		int [] previousNode = new int[matrix.length];
		for (int i = 1; i < weight.length; i++) {
			weight[i] = Integer.MAX_VALUE;
			previousNode[i]=-1;
		}
		
		ArrayList<Integer> edges= new ArrayList<Integer>();
		int y =0;
		
		while(notFound.size()>0){
			for (Integer integer : notFound) {
				if(matrix[integer][y]< weight[integer]){
					previousNode[integer]= y;
					weight[integer]=matrix[integer][y];
				}
			}
			int min = Integer.MAX_VALUE;
			
			int bestNode=0;
			int bestPrevNode=0;
			for (Integer integer : notFound) {
				if(weight[integer] < min){
					bestNode = integer;
					bestPrevNode = previousNode[integer];
					min = weight[integer];
				}
			}
			edges.add(matrix[bestNode][bestPrevNode]);
			notFound.remove(bestNode);
			y= bestNode;
		}

		
		int sum = 0;
		for (Integer integer : edges) {
			sum+= integer;
		}
		long total=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				if(matrix[i][j]!=Integer.MAX_VALUE ){
					total+=matrix[i][j];
				}
			}
		}
		System.out.println(total);
		System.out.println(sum);
		System.out.println(total-sum);
	}
	
	public static int[][] readinput() throws Exception{
		scanner  = new Scanner(new BufferedReader(new FileReader("input/p107.txt")));
		ArrayList<String[]> list = new ArrayList<String[]>();
		
		while(scanner.hasNext()){
			String[] a = scanner.nextLine().split(",");
			list.add(a);
		}
		int[][] matrix = new int[list.size()][list.size()];
		int j=0;
		for (String[] strings : list) {
			for (int i = 0; i < strings.length; i++) {
				if(strings[i].equals("-")){
					matrix[j][i]=Integer.MAX_VALUE;
				}else{
					matrix[j][i] = Integer.parseInt(strings[i]);
				}
			}
			j++;
		}
		return matrix;
	}
	public static void printMat(int[][] matrix){
		
		DecimalFormat formatter = new DecimalFormat("000");
		for (int i = 0; i < matrix.length; i++) {
			for (int k = 0; k < matrix.length; k++) {
				System.out.print(formatter.format(matrix[i][k]) + " ");
			}
			System.out.println();
		}
		
	}
	

}
