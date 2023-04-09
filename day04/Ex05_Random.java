package day04;

import java.util.Random;

import util.MyUtil;

public class Ex05_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p(u.BOLD + "Random Example" + u.END);
		
		Random rd = new Random();
		
		// Random Number
		u.p("" + rd.nextInt());
		u.p("" + (rd.nextInt(100) + 1));  // 1부터 100까지
		u.p("" + rd.nextFloat());
		u.p("" + rd.nextDouble());
		
		// Random Alphabet
		// 임의의 영문 대문자 한글자가 나오도록 해보시오.
		// A : 0x41, 65 
		char random_char = (char)(rd.nextInt(26) + 65);
		u.p("Random Alphabet 1 : " + random_char);
		
		// 대소문자 중 Random Alphabet
		// hint) A : 65(0x41), a : 97
		random_char = (char)(rd.nextInt(26) + 65 + rd.nextInt(2) * 32); 
		u.p("Random Alphabet 2 : " + random_char);
	}
}
