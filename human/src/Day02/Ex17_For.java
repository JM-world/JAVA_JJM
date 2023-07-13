package Day02;

public class Ex17_For {

	public static void main(String[] args) {
		// for( 1초기식 ; 2조건식 ; 4증감식 ) { 3실행문; }
		// 실행 순서 : 1 -> 반복 ( 2 -> 3 -> 4 )
		
		// 1. 1~10 까지의 정수를 출력하시오
		for ( int a = 1 ; a <= 10 ; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		// 2. 50~100 까지의 정수를 출력하시오
		for ( int a = 50 ; a <= 100 ; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		// 3. 1~20 까지의 정수 중 짝수만 출력하시오
		for (int a = 1; a <= 20 ; a++ ) {
			 int b = ++a;
			 System.out.print( b + " ");
		} System.out.println();
		
		// 4. 1~20 까지의 정수 중 홀수만 출력하시오
		for (int a = 1; a <= 20 ; a++ ) {
			if ( a % 2 == 1 ) {
				System.out.print( a + " " );				
			}
		} System.out.println();
		
		
	}
}
