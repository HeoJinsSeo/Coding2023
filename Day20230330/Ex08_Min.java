package Main.Day20230330;

import java.util.Scanner;

public class Ex08_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int Min = a;
		
		if(Min>b) {
			Min = b;
			
		}
		if(Min>c) {
			Min = c;
		}
		System.out.print(Min);
		
	
	}
}
