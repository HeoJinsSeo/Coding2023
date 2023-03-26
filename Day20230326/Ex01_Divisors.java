package Main.Day20230326;

import java.util.Scanner;

public class Ex01_Divisors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	
}
