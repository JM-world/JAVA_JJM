package Day02;

public class Ex19_GuguAll {

	public static void main(String[] args) {
		// (단)x(2~9)
		// 단에 대한 반복 	: 2~9
		// 각 단에 곱		: 1~9
		
		// A x B
		// i : 단(A)
		for ( int i = 1; i <= 9; i++) {
			
			// j : 곱(B)
			for ( int j = 2; j <= 9; j++ ) {
				int result = i * j;
				System.out.print( j + " x " + i + " = " + result );
				System.out.print("\t");		//탭
			}
			System.out.println();
			
		}	
	
	}
}
