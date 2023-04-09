package day14;

import util.MyUtil;

public class Ex22_Main {
	
	public static void main(String[] args) {
		Ex22_MyClass1 c1 = new Ex22_MyClass1();
		
		MyUtil.p("c1.aaa = " + c1.aaa);
		MyUtil.p("MyInterface.aaa = " + Ex22_MyInterface.aaa);
		c1.dMethod();  // default method는 구현하지 않아도 됨
		//c1.sMethod();  // static method는 구현이 되지 않음
		
		Ex22_MyClass2 c2 = new Ex22_MyClass2();
		c2.dMethod();
		c2.sMethod();
		Ex22_MyClass2.sMethod();
		Ex22_MyInterface.sMethod();
	}
}
