package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("M : ");
		int M = sc.nextInt();
		System.out.print("N : ");
		int N = sc.nextInt();

		int arr[][] = new int[M][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
		
		// 위와 같이, X행Y열 2차원 배열을 생성하고,
		// 순서대로 값을 입력받아 그대로 출력해보세요.
		// 단, 출력 시 foreach 문을 사용)
		
		System.out.print("X : ");
		int X = sc.nextInt();
		System.out.print("Y : ");
		int Y = sc.nextInt();
		System.out.print("Z : ");
		int Z = sc.nextInt();
		
		int arr2[][][] = new int[X][Y][Z];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				for (int k = 0; k < arr2[i][j].length; k++) {
				
				arr2[i][j][k] = sc.nextInt();
			}
			
		}
		
		for (int[][] is : arr2) {
			for (int[] is2 : is) {
				for (int is3 : is2) {
					System.out.print(is3 + " ");
					
				}
				System.out.println();
			}
			System.out.println();
			}
		}
		
		sc.close();
	}
}
