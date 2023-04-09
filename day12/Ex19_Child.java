package day12;

import util.MyUtil;

public class Ex19_Child extends Ex19_Parent {
	String name = "Child";
	
	Ex19_Child(){
		MyUtil.p("Child Created");
	}
	
	void print() {
		String name = "Super Child";
		MyUtil.p("[print()] " + name);
		MyUtil.p("[print()] " + this.name);
		MyUtil.p("[print()] " + familyname);
		MyUtil.p("[print()] " + super.name);
	}
	
	void eat() {
		super.eat();
		MyUtil.p("아이스크림먹기");
		MyUtil.p("불량식품아폴론먹기");
	}
	
	void shout() {
		MyUtil.p("내 이름은 " + this.name + "!!!!!");
		MyUtil.p("내 이름은 " + name + "!!!!!");
	}
}
