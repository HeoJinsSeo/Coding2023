package Main.Day20230325;

import java.util.Scanner;

public class Ex06_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		 
		int[] arr = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
			sum +=arr[i];
		}
		System.out.println(sum);
		
		sc.close();
	}
}
