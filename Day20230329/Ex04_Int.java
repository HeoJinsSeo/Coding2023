package Main.Day20230329;

import java.util.Scanner;

public class Ex04_Int {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(N>0) {
			System.out.print("-");
			System.out.print(Math.abs(N));
		}else if (N<0){
			
			System.out.print(Math.abs(N));
		}else {
			System.out.print(0);
		}
		
	}
}
