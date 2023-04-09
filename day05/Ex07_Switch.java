package day05;

import java.util.Random;
import java.util.Scanner;

import util.MyUtil;

public class Ex07_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Switch Example");
		
		Random r = new Random();
		int i = r.nextInt(3);  // i는 0, 1, 2 중 하나
		u.p("현재 결정된 i의 값은 " + i);
		
		switch(i) {
			case 0:
				u.p("0이었군");
				break;
			case 1:
				u.p("1이었네");
				break;
			case 2:
				u.p("This is two");
				u.p("축 당첨!!!!!! 만수르 재산 정도의 상품 증정");
				break;
			default:
				u.p("삐이이익!!! 버그 발생");
		}
		
		int step = 1;
		
		switch(step) {
			case 1:  // 인프라 구축
				u.p("각종 재료와 장비들을 준비합니다");
			case 2:	 // 아이템 구축 
				u.p("책과 레시피를 수집합니다.");
			case 3:  // 전문가 컨설팅
				u.p("백종원을 초빙합니다");
			case 4:  // 오픈
				u.p("주변에게 알리고 전단지를 돌립니다.");
		}
		
		// 사용자로부터 주민번호 맨 뒷자리 입력을 받는다.
		// 1, 6인 경우 월요일, 2, 7인 경우 화요일 ....
		// 5, 0인 경우 금요일
		// "백신 접종 요일은 *요일이십니다"
		// switch ~ case문으로 구현해보세요.
		
		Scanner sc = new Scanner(System.in);
		u.p("주민번호 맨 뒷자리를 입력하세요 : ");
		int fnum = sc.nextInt();
		String day = "";
		
		switch(fnum) {
			case 1, 6:
				day = "월";
				break;
			case 2, 7:
				day = "화";
				break;
			case 3, 8:
				day = "수";
				break;
			case 4, 9:
				day = "목";
				break;
			default:
				day = "금";
		}
		
		u.p("백신 접종 요일은 " + day + "요일입니다.");
		
	}

}
