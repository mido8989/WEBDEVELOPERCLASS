package day11;

public class Ex15_Auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass mc = new MyClass();
		System.out.println("mc.a = " + mc.a);
		mc.a = 103;
		System.out.println("mc.a = " + mc.a);
		//System.out.println("mc.b = " + mc.b);
		System.out.println("mc.b = " + mc.getB());
		mc.setB(105);
		System.out.println("mc.b = " + mc.getB());
	}

}

class MyClass {
	public int a = 3;
	private int b = 5;
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
}
