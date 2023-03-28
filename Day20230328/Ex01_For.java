package Main.Day20230328;

import java.util.Scanner;

public class Ex01_For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int num = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				num++;
				
				System.out.print(num + " ");
				
			}
			System.out.println();
			
		}
		
	}
}
