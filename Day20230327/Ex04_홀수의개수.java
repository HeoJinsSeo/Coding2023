package Main.Day20230327;

import java.util.Scanner;

public class Ex04_홀수의개수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==1) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		
	}
}
