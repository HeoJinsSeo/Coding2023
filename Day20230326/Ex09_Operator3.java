package Main.Day20230326;

import java.util.Scanner;

public class Ex09_Operator3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		
		for (int i = a; i <= b; i++) {
			if(i%2 == 1) {
				result +=i;
			}else {
				result -=i;
		
			}
	
			if(i%2==0) System.out.print("-");
			System.out.print(i);
			if(i>=b) System.out.print("=");
		
			else if (i%2==0)    System.out.print("+");
		
		}
		
		System.out.println(result);
		
	}
}
