package Main.Day20230325;

import java.util.Scanner;

public class Ex02_EvenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		int i=1;
		
		while (i<=N ) {
		 
			if(i%2==0) {
				sum +=i;
				
			}
			i++;
			
		}
		System.out.print(sum);
		
		sc.close();
	}
}
