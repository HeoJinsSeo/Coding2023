package Main.Day20230330;

import java.util.Scanner;

public class Ex15_Pyramid2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = N*(N+1)/2;
		while(num>=1) {
			for (int i = N; i >=1 ; i--) {
				for (int j = (N+1)-i; j >= 1; j--) {
					System.out.print(num+" ");
					num--;
				}
				System.out.println();
				
			}
		}
				
			}
	}
