package Main.Day20230326;

import java.util.Scanner;

public class Ex02_IsPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean isPrime = true;
		
		if(N<=1) {
			isPrime = false;
			
		} else {
			for(int i = 2; i <= Math.sqrt(N); i++) {
				if(N%i == 0) {
					isPrime = false;
					break;
				} 
			}
			
		}
		
		if(isPrime) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
	}
}
