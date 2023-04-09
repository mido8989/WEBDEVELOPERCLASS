package day08;

import java.util.Random;

import util.MyUtil;

public class Ex10_Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p("Color Test");
		u.p(u.MAGENTA + "Font Style" + u.END);
		u.p(u.BOLD + "BOLD" + u.END);
		u.p(u.INTENSITY + "INTENSITY" + u.END);
		u.p(u.ITALIC + "ITALIC" + u.END);
		u.p(u.UNDERLINE + "UNDERLINE" + u.END);
		u.p(u.NEGATIVE + "NEGATIVE" + u.END);
		u.p(u.CROSSEDOUT + "CROSSEDOUT" + u.END);
		u.p(u.DOUBLEUNDERLINE + "DOUBLEUNDERLINE" + u.END);
		
		// AA라는 글자를 8색으로 나타내시오.
		// for문으로 구현할 것 + System.out.println(X) => System.out.print()
		// "\033[색상코드m" + 문장 + "\033[0m"
		for(int i=30;i<38;i++) {
			System.out.print("\033[" + i + "m" + "AA" + u.END);
		}
		u.p("");
		for(int i=90;i<98;i++) {
			System.out.print("\033[" + i + "m" + "AA" + u.END);
		}
		u.p("");
		
		// 바탕색을 "  "로 표현하시오. 일반바탕색 1줄, 밝은바탕색 1줄 
		for(int i=40;i<48;i++) {
			System.out.print("\033[" + i + "m" + "  " + u.END);
		}
		u.p("");
		for(int i=100;i<108;i++) {
			System.out.print("\033[" + i + "m" + "  " + u.END);
		}
		u.p("");
		
		u.p("Extended 256 Color");
		for(int i=0;i<256;i++) {
			System.out.print("\033[38;5;" + i + "m" + "A" + u.END);
		}
		u.p("");
		for(int i=0;i<256;i++) {
			System.out.print("\033[48;5;" + i + "m" + " " + u.END);
		}
		u.p("");
		
		u.tp("True Color");
		for(int i=0;i<256;i++) {
			System.out.print("\033[48;2;" + i + ";0;0" + "m" + " " + u.END);
		}
		u.p("");
		// Green, Blue를 똑같이 표현하시오.
		for(int i=0;i<256;i++) {
			System.out.print("\033[48;2;0;" + i + ";0" + "m" + " " + u.END);
		}
		u.p("");
		for(int i=0;i<256;i++) {
			System.out.print("\033[48;2;0;0;" + i + "m" + " " + u.END);
		}
		u.p("");
		for(int i=0;i<256;i++) {
			System.out.print("\033[48;2;" + i + ";" + i + ";" + i + "m" + " " + u.END);
		}
		u.p("");
		
		// r, g, b 각각을 256 랜덤으로 뽑아서 색을 만드시오.
		// 총 256픽셀을 출력하되, 64픽셀마다 한 줄씩 내리시오.
		Random rd = new Random();
		int r, g, b;
		for(int i=0;i<256;i++) {
			r = rd.nextInt(256);
			g = rd.nextInt(256);
			b = rd.nextInt(256);
			// g = r; b = r;  // for grayscale
			System.out.print("\033[48;2;"+r+";"+g+";"+b+"m"+" "+u.END);
			if(i % 64 == 63)
				u.p("");
		}
		
		// all color infinite loop
		/*
		int count = 0;
		for(r=200;r<256;r++) {
			for(g=200;g<256;g++) {
				for(b=200;b<256;b++) {
					System.out.print("\033[48;2;"+r+";"+g+";"+b+"m"+" "+u.END);
					if(count % 64 == 63)
						u.p("");
					count++;
				}
			}
		}
		*/
	}

}
