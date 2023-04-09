package day03;

import util.MyUtil;

public class Ex03_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		u.p(u.RED + "Day3 Operator" + u.END);
		
		// 1. 대입연산
		int num = 10;
		u.p("1. num = " + num);
		
		// 2. 대입연산2
		num += 10;  // num = num + 10   num = 20
		u.p("2-1. num = " + num);
		num -= 10;
		u.p("2-2. num = " + num);
		num += (num + num);
		u.p("2-3. num = " + num);
		
		// 3. 산술연산
		num = 5 + 5 * 2;
		u.p("3-1. num = " + num);
		num = 5 * (5 + 2);
		u.p("3-2. num = " + num);
		
		final int NUM_OF_GRP = 3;
		num = 35 % NUM_OF_GRP;  // 35 / 3   11 * 3 + 2
		u.p("3-3. 현재 데이터는 " + num + " 작업에서 처리합니다.");
		//NUM_OF_GRP = 10;
		
		// 4. 산술연산 2
		float numf = 10 / 4F;
		u.p("4-1. numf = " + numf);
		double numd = 10 / 4F;  // float보다 double의 공간이 크므로 가능
		u.p("4-2. numd = " + numd);
		
		// 5. 산술연산3
		//num = 10 / 0;  // 현재는 예외발생 후 종료, 추후 예외처리로 처리 가능
		
		// 6. 증감연산
		int a = 10, b = 10;
		u.p("6-1. a = " + a + " b = " + b);
		a++;  // a = a + 1,  a += 1과 동일
		++b;
		u.p("6-2. a = " + a + " b = " + b);
		
		int x = a++;  // a를 할당하고 ++  x = 11 a = 12
		int y = ++b;  // b를 ++ 후 할당
		u.p("6-3. x = " + x + " y = " + y);
		
		// int x = a; a++; 이 더 좋은 방식
		
		// 7. 비교연산
		a = 10; b = 5;
		u.p("7-1. a == b : " + (a == b));
		int c = 7;
		//boolean result = a > b > c;   (a > b) && (b > c)
		
		// 8. 논리연산
		u.p("8-1 : " + (true && false));
		u.p("8-2 : " + (true || false));
		u.p("8-3 : " + (true ^ true));

		// 9. 삼항연산
		int score = 29;
		String baddad = (score>99)? "당연" : "%$^%^%*&%&%";
		u.p("9-1 baddad : " + baddad);
		
		String host = (score>30)? "맥주" : "한국으로 돌아가";
		u.p("9-2 host : " + host);
		
		// 10. 비트연산
		int b1 = 1;
		int b2 = 2;
		u.p("10. b1 & b2 = " + (b1 & b2));
		
		int b3 = -1;
		u.p("10-2. b3(hex) : " + Integer.toHexString(b3));
		u.p("10-2. b3(bin) : " + Integer.toBinaryString(b3));
		
		int b4 = 100;
		int b5 = b4 * 4;
		int b6 = b4 << 2;  // 2진수로 표현했을 때 2칸 왼쪽으로 shift
		
	}

}
