package Main.Day20230330;

import java.util.Scanner;

public class Ex12_Star {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= (N+1)/2; i++) {
			for (int j = 1; j <= (N+1)/2-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		}
		
	}