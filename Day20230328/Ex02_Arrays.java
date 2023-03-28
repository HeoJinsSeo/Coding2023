package Main.Day20230328;

import java.util.Scanner;

public class Ex02_Arrays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][N];
		int num = 1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j]= num;
				num++;
			}
		}

		for (int i = 0; i < N ; i++) {
			for (int j = N-1; j >= 0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		}
		
	}

