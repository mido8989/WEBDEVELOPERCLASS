package day04;

import java.util.Scanner;

import util.MyUtil;

public class Ex04_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		
		// 1. 실행 시에 입력하기
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		// 2. Scanner 이용
		Scanner sc = new Scanner(System.in);
		u.p("이름을 입력하십시오 :");
		String name = sc.next();
		u.p("앗! 당신이 그 유명한 범죄자 " + name + "이군요!!");
		
		u.p("당신의 전투력을 입력하십시오. : ");
		// 전투력을 소수점으로 입력받아 60.0이 넘는 경우
		// 너무 강하군.. 그러나 말할 수 없는 저 강력함이 내 피를 끓게 하는군.
		// 60.0 이하의 경우
		// 너 죽었어
		float strength = sc.nextFloat();
		String str = (strength > 60.0)? 
				"너무 강하군.. 그러나 말할 수 없는 저 강력함이 내 피를 끓게 하는군." : "너 죽었어";
		u.p("내가 말했습니다.");
		u.p(str);
		
	}

}
