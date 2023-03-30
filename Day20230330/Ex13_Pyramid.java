package Main.Day20230330;

import java.util.Scanner;

public class Ex13_Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N>=1) {
			for (int i = 0; i <N; i++) {
				System.out.print(N+" ");
			}
			System.out.println();
			N--;
		}
	}
}
