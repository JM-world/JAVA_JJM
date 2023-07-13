package Day05;

import java.util.Scanner;

public class Ex06_Method {

	// 덧셈
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 뺄셈
	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt(); 
		
		
		System.out.print("b : ");
		int b = sc.nextInt(); 
		
		// 메소드 호출 : 메소드명( 인자1, 인자2 )
		// - 전달인자(argument)
		System.out.println( plus(a, b) );
		System.out.println( minus(a, b) );

		sc.close();
		
		
	}
}
