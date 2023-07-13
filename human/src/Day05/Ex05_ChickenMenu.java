package Day05;

import java.util.Scanner;

public class Ex05_ChickenMenu {

	/**
	 * ########## 메 뉴 판 ########## 1. 교촌 치킨 - 허니콤보 치킨 2. 처갓집 - 양념 치킨 3. 굿후렌드 - 후라이드
	 * 치킨 4. 후라이드잘하는집 - 후라이드 치킨 5. 보드람 - 후라이드 치킨 6. 굽네 치킨 - 볼케이노 7. BBQ - 한금올리브 반반
	 * 치킨 0. 종료 ########## 입력 :
	 * 
	 * "(해당메뉴)이 주문되었습니다." 라고 출력하시오. 0을 입력하기 전까지 반복하고, 0을 입력하면 반복을 종료합니다.
	 * 
	 */
	public static void printmenuName() {
		System.out.println(" ########## 메 뉴 판 ########## ");
		System.out.println("1. 교촌 치킨 \t- 허니콤보 치킨");
		System.out.println("2. 처갓집 \t- 양념 치킨");
		System.out.println("3. 굿후렌드 \t- 후라이드 치킨");
		System.out.println("4. 후라이드잘하는집 \t- 후라이드 치킨");
		System.out.println("5. 보드람 \t- 후라이드 치킨");
		System.out.println("6. 굽네치킨 \t- 볼케이노");
		System.out.println("7. BBQ \t\t- 황금올리브 반반 치킨");
		System.out.println("0. 종료");
		System.out.print("########## 입력 : ");
	}

	public static String selectmenuName(int menuNo) {
		String menuName = "";
		switch (menuNo) {
		case 1:
			menuName = "교촌치킨 		- 허니콤보 치킨";
			break;
		case 2:
			menuName = "처갓집 		- 양념 치킨";
			break;
		case 3:
			menuName = "굿후렌드 		- 후라이드 치킨";
			break;
		case 4:
			menuName = "후라이드잘하는집	- 후라이드 치킨";
			break;
		case 5:
			menuName = "보드람 		- 후라이드 치킨";
			break;
		case 6:
			menuName = "굽네치킨 		- 볼케이노";
			break;
		case 7:
			menuName = "BBQ 		- 황금올리브 반반 치킨";
			break;

		}
		return menuName;

	}

	public static void main(String[] args) {

		int menuNo;
		String menuName = "";
		int sum = 0;
		Scanner sc = new Scanner(System.in);

		do {

			printmenuName();

			menuNo = sc.nextInt();

			menuName = selectmenuName(menuNo);

			if (menuNo >= 1 && menuNo <= 7) {
				System.out.println(menuName + "이 주문되었습니다.");
				sum += 1;
			} else if (menuNo == 0)
				break;
			else {
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요.");
			}

		} while (menuNo != 0);
		System.out.println(sum + "개의 주문을 완료합니다.");
		sc.close();

	}
}
