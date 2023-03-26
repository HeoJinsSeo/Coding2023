package Main.Day20230326;

import java.util.Scanner;

public class Ex05_IndexPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println(arr[0]+" "+arr[N/2]+" "+arr[N-1]);
		
	}
}
