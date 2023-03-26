package Main.Day20230325;

import java.util.Scanner;

public class Ex10_MaxAndMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]= sc.nextInt();
		}
		
		int Max = arr[0];
		int Min = arr[0];
		for (int j = 0; j < arr.length; j++) {
			
			if(arr[j]>Max) {
				Max = arr[j];
			}
			if(arr[j]<Min) {
				Min = arr[j];
			}
			
		}
		System.out.println(Max);
		System.out.println(Min);
		
	  sc.close();	
	}
	
}
