package Day03;

import java.util.Iterator;
import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		// 첫째 줄에 입력할 개수 N을 입력받고,
		// 둘째 줄에 N개의 정수에 공백을 두고 입력받으시오.
		// N개의 정수 중, 최댓값을 구하여 출력하시오.
		// (입력 예시)
		// 5
		// 90 60 70 100 55
		// (출력 예시)
		// 최댓값 : 100
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int arr[] = new int[N];
		int max = 0;
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if( max < arr[i] ) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		sc.close();
		
		
	}
}
