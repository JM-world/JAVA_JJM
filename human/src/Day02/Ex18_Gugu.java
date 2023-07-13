package Day02;

import java.util.Scanner;

public class Ex18_Gugu {

	public static void main(String[] args) {
		// 구구단 (1~9단)
		// 원하는 단을 입력하여 아래와 같이 구구단 수식을 출력하시오.
		// 입력 : 3
		// 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc. nextInt();
		
		for ( int a = 1; a <= 9; a++ ) {
			int result = input * a;
			System.out.println( input + " * " + a + " = " + result );
		}
		
		sc.close();
		
	}
}
