package Main.Day20230325;

import java.util.Scanner;

public class Ex07_Gugu3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		sc.close();
	}
}
