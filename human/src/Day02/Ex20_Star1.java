package Day02;

import java.util.Scanner;

public class Ex20_Star1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for ( int a = 1; a <= n; a++ ) {
			for ( int b = 1; b <= a; b++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}