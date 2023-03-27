package Main.Day20230327;

import java.util.Scanner;

public class Ex03_5의배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%5==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		
		sc.close();
		
	}
}
