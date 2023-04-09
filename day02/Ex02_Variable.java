package day02;

import util.MyUtil;

public class Ex02_Variable {
	public static void main(String[] args) {
		MyUtil u = new MyUtil();
		
		System.out.println(u.GREEN + "Variable Test" + u.END);
		u.p(u.BOLD + u.RED + "Variable Test" + u.END);
		
		// 1. int, long, float, double
		int var1 = 30;
		long var2 = 30L;  // 30은 integer 타입
		float var3 = 3.008F;  // 3.008은 double타입인데 double이 공간이 더 큼
		double var4 = 3.008;
		
		// 2. char
		char ch1 = 'a';
		char ch2 = 97;
		char ch3 = 0x61;
		u.p("2. ch1, ch2, ch3 = " + ch1 + " " + ch2 + " " + ch3);
		String str = "여러 글자는 이렇게 쓰세요";
		
		// 3. char를 int에 넣을 때
		char ch4 = 'a';
		int chi = ch4;  // int가 더 범위가 넓으므로 가능
		//ch4 = chi;  // 넓은 곳에서 좁은 곳으로는 자연스럽게 못감
		ch4 = (char)chi;  // (Type)Casting
		u.p("3. ch4 = " + ch4);
		
		// 4. int, double 변환
		int int1 = 100;
		double db1 = int1;  // double이 공간이 더 큼		
		u.p("4-1. db1 = " + db1);
		
		double db2 = 3.14;
		int int2 = (int)db2;
		u.p("4-2. int2 = " + int2);
		
		// 5. String
		String myName = "NoName";
		u.p("5. My Name is " + myName + "이 아닙니다.");
		
		// 6. String, int, double
		String temp = "" + 3;  // trick
		String temp2 = "3";
		String temp3 = "3.1782353539343694";
		int temp2i = Integer.parseInt(temp2);
		double temp3d = Double.parseDouble(temp3);
		float temp3f = Float.parseFloat(temp3);
 		u.p("6. temp2i, temp3d, temp3f = " 
		     + temp2i + " " + temp3d + " " + temp3f);
 		
 		// 7. boolean
 		boolean b = true;
 		boolean b2 = (3 < 5);
 		u.p("7. b, b2 = " + b + " " + b2);
 		
	}
}
