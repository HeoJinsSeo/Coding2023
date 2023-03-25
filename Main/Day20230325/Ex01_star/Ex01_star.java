package Day20230325.Ex01_star;

import java.util.Scanner;
public class Ex01_star {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        int i = 1;
        while (i<=N) {
            System.out.print("*");
            i++;
        }
        sc.close();
}
}

