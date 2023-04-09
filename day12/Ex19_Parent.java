package day12;

import util.MyUtil;

public class Ex19_Parent {
	String name = "Parent";
	String familyname = "Leopard";
	
	Ex19_Parent(){
		MyUtil.p("Parent Created");
	}
	
	void eat() {
		MyUtil.p("나 " + name + "은(는) 식사를 합니다.....");
		MyUtil.p("빵먹기");
		MyUtil.p("밥먹기");
		MyUtil.p("음료수먹기");
		MyUtil.p("연타발에서먹기");
	}
	
	void shout() {
		MyUtil.p("내 이름은 " + this.name + "!!!!!");
		MyUtil.p("내 이름은 " + name + "!!!!!");
	}
}
