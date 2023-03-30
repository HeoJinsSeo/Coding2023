package Main.Day20230330;

import java.util.Scanner;

public class Ex07_두수의차 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>=b)
			System.out.print(a-b);
		else
			System.out.print(b-a);
	}
}
