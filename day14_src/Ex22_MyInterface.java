package day14;

import util.MyUtil;

public interface Ex22_MyInterface {
	int aaa = 500;
	
	void myMethod();
	
	default void dMethod() {
		MyUtil.p("아~ 진짜 내가 이런거 만들어야되나 현타온다.");
	}
	
	static void sMethod() {
		MyUtil.p("구현 안하셔도 돼요. 아무나 갖다 쓰세요.");
	}
}
