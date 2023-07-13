package Day03;

import java.util.Scanner;

public class Ex03_Min {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최솟값 : " + min);
		
		if (N==arr.length) {
			System.out.println(true);
		}
		sc.close();
	}
}
