package Day03;

import java.util.Scanner;

public class Ex07_ZigZag {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[][] = new int[N][N];

		int k = 1;
		int sw = 1;

		for (int i = 0; i < arr.length; i++) {
			if (sw == 1) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = k++;
				}
				sw = -1;
			}

			else {
				for (int j = N - 1; j >= 0; j--) {
					arr[i][j] = k++;
				}
				sw = 1;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
