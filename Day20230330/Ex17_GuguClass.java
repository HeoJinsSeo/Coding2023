package Main.Day20230330;


public class Ex17_GuguClass {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.print(j+" x "+i+" = ");
				System.out.printf("%2d",j*i);
				System.out.print("\t");
				
			}
			System.out.println();
		}
	}
}
