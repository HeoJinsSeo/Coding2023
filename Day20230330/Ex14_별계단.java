package Main.Day20230330;

import java.util.Scanner;

public class Ex14_별계단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(" ");
			}
			System.out.print("**");
			System.out.println();
		}
		
		
		
	}
}
