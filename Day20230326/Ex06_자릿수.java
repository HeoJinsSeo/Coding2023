package Main.Day20230326;

import java.util.Scanner;

public class Ex06_자릿수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		while(N != 0) {
			N /=10;
			count++;
		}
		System.out.println(count);
	}
}
