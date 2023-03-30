package Main.Day20230330;

import java.util.Scanner;

public class Ex11_사주 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int YY = sc.nextInt();
		int MM = sc.nextInt();
		int DD = sc.nextInt();
		
		int sum = YY+MM+DD;
		int sum2 = (sum-(sum/1000*1000))/100;
		
		if(sum2%2==0) {
			System.out.print("대박");
		}
		else {
			System.out.print("그럭저럭");
		}
	}
}
