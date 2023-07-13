package Day02;

import java.util.Scanner;

public class Ex21_Star2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n : ");
		int n = sc.nextInt();
		
		for ( int a = 1; a <= n; a++) {
			for ( int b = 1; b <= n - a + 1; b++ ) {
				System.out.print("*");
			}
				System.out.println();
		}
		sc.close();
	}
}
