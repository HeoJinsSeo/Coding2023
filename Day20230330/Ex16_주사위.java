package Main.Day20230330;

import java.util.Scanner;

public class Ex16_주사위 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= 6; i++) {
			if(N-i<=6 && N-i>=1) {
			System.out.println(i+" "+(N-i));
			}
			}
	}
}
