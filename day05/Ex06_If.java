package day05;

import java.util.Random;

import util.MyUtil;

public class Ex06_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("If Example");
		
		int a = -1000;
		
		if(a > 100){                     
			u.p(u.BOLD + "Such a Big Number!!" + u.END);
		}
		else if(a > 0){
			u.p(u.RED + "It is a positive number" + u.END);
		}
		else if(a == 0) {
			u.p(u.GREEN + "It is Zero" + u.END);
		}
		else {
			u.p(u.RED + u.GREEN + u.BOLD + "MINUS" + u.END);
		}
		
		// nested if
		// 영어와 수학 점수가 모두 60점 이상이면 Pass, 아니면 Fail
		Random rd = new Random();
		int eng = rd.nextInt(101);
		int math = rd.nextInt(101);
		u.p("ENG : " + eng + " MATH : " + math);
		
		// eng 또는 math가 90점 이상이면 통과시켜주는 조건 추가
		if(eng >= 60 && math >= 60) {
			u.p("Pass!!!!!");
		}
		else {
			if(eng >= 90 || math >= 90) {
				u.p("Pass!!!!!");
			}
			else {
				u.p("Fail ㅠㅠ");
			}
		}
		
		if(eng >= 60 && math >= 60)	
			u.p("Pass!!!!!");
		else
			if(eng >= 90 || math >= 90)	u.p("Pass!!!!!");
			else u.p("Fail ㅠㅠ");
		
	}

}
