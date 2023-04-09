package day12;

public class Ex17_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex17_Child c = new Ex17_Child();
		
		System.out.println("c 너는 무슨 소속이냐? " + c.getClass().getSimpleName());
		
		//Ref1 r1 = new Ref1();
	}
}

class Ref1 {
	Ref2 r2 = new Ref2();
}

class Ref2 {
	Ref1 r1 = new Ref1();
}

