package Day05;

import java.util.Scanner;

public class Ex02_NumberOfCurrency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력금액
		int num = 0; // 화폐매수
		int cur = 50000; // 화폐단위

//		int a = N / 50000;
//		int b = (N - a * 50000) / 10000;
//		int c = (N - a * 50000 - b * 10000) / 5000;
//		int d = (N - a * 50000 - b * 10000 - c * 5000) / 1000;
//		int e = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000) / 500;
//		int f = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000 - e * 500) / 100;
//		int g = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000 - e * 500 - f * 100) / 50;
//		int h = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000 - e * 500 - f * 100 - g * 50) / 10;
//		int i = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000 - e * 500 - f * 100 - g * 50 - h * 10) / 5;
//		int j = (N - a * 50000 - b * 10000 - c * 5000 - d * 1000 - e * 500 - f * 100 - g * 50 - h * 10 - i * 5) / 1;
//		
//		System.out.println("금액 : " + N + "원");
//		System.out.println("50,000원 : " + a + "개");
//		System.out.println("10,000원 : " + b + "개");
//		System.out.println("5,000원 : " + c + "개");
//		System.out.println("1,000원 : " + d + "개");
//		System.out.println("500원 : " + e + "개");
//		System.out.println("100원 : " + f + "개");
//		System.out.println("50원 : " + g + "개");
//		System.out.println("10원 : " + h + "개");
//		System.out.println("5원 : " + i + "개");
//		System.out.println("1원 : " + j + "개");

		num = N / cur;
		System.out.println("50000원 \t: " + num + "개");
		int z = N % cur;
		for (int i = 9; i >= 1; i--) {
			if (i % 2 == 1)
				cur = cur / 5;
			else
				cur = cur / 2;
			num = z / cur;

			System.out.println(cur + "원 \t: " + num + "개");
			z = z - num * cur;

		}
		sc.close();
	}
}
