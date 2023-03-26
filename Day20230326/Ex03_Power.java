package Main.Day20230326;

import java.util.Scanner;

public class Ex03_Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = 1;
		if(a==1) {
			System.out.println(1);
		} else {
			for (int i = 1; i <= b; i++) {
				c *=a;
				
			}
			System.out.println(c);
		}
		sc.close();
		
	}
}
