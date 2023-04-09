package day12;

public class Ex19_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex19_Parent p = new Ex19_Parent();
		Ex19_Child c = new Ex19_Child();
		c.print();
		p.eat();
		c.eat();
		
		p.shout();
		c.shout();
	}

}
