package Day01;

public class Ex11_Long {

	public static void main(String[] args) {
		
		// int (4byte : 32bits) : 2^32개 : 42억개
		// int 수 표현 범위 : -21억xxx ~ 21억xxx
		
		// long (8byte : 64bits) : 2^64개
		long In1 = 1000;
		long In2 = 2100000000;
		// long 타입 리터럴 : 숫자L
		long In3 = 2200000000L;
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println("int 최댓값 : " + max);		// int 최댓값
		System.out.println("int 최솟값 : " + min);		// int 최솟값

		System.out.println("In1 : " + In1);
		System.out.println("In2 : " + In2);
		System.out.println("In3 : " + In3);
		
		
		
	}
}
