package Main.Day20230326;

import java.util.Scanner;

public class Ex11_UppercaseAndLowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		char arr[] = sentence.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char A = arr[i];
			if(Character.isUpperCase(A)) {
				arr[i]=Character.toLowerCase(A);
			} else if (Character.isLowerCase(A)){
				arr[i]=Character.toUpperCase(A);
			}
		}
		String result = new String(arr);
		System.out.println(result);
	}
}
