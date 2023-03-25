package Main.Day20230325;

import java.util.Scanner;

public class Ex05_Gugu2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= N*i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		
		
	}
}
