package day10;

import util.MyUtil;

public class Ex14_InitialBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Guest g1 = new Guest("Son Heung Min");
		Guest g2 = new Guest("Klinsmann");
		Guest g3 = new Guest("Europa");
	}

}

class Guest {
	String name;
	
	Guest(String name){
		this.name = name;
		MyUtil.p("[Guest] " + name + "님이 도착하셨습니다.");
	}
	
	// Code Block(since Java8 ~ )
	static {
		MyUtil.p("[static] 드디어 손님이 오시는군요");
	}
	
	{
		MyUtil.p("[ { } ] 새로운 손님 도착!!");
	}
}
