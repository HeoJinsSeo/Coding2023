package Main.Day20230326;

import java.util.Scanner;

public class Ex10_MaxAndMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
		}
		
		int max =arr[0];
		int min =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(max+ " " + min);
		
			
		}
			
		
	}
