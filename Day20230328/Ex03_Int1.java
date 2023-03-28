package Main.Day20230328;

import java.util.Scanner;

public class Ex03_Int1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N1 = N/10000*10000;
		int N2 = N%N1/1000*1000;
		int N3 = N%N1%N2/100*100;
		int N4 = N%N1%N2%N3/10*10;
		int N5 = N%N1%N2%N3%N4;
		
		System.out.println("["+N1+"]");
		System.out.println("["+N2+"]");
		System.out.println("["+N3+"]");
		System.out.println("["+N4+"]");
		System.out.println("["+N5+"]");
	}
}
