package Main.Day20230327;

import java.util.Scanner;

public class Ex06_RectangleStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			if(i==0 || i==(N-1)) {
				for (int j = 0; j < N; j++) {
					System.out.print("*");
				}
				System.out.println();
			} 
			else {
				System.out.print("*");
				for (int j = 1; j < N-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
	}
}
