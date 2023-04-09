package day14;

import util.MyUtil;

public class Ex21_CalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex21_CalDummy c = new Ex21_CalDummy();
		Ex21_Calc c = new Ex21_Calc();
		
		c.setOperand(10, 21, 30);
		MyUtil.p("Total Summation is " + c.sum());
		MyUtil.p("Average is " + MyUtil.ITALIC + c.avg() + MyUtil.END);
	}

}

class Ex21_CalDummy implements Ex21_CalIf {
	public void setOperand(int first, int second, int third) {}
	
	public int sum() {
		return 100;
	}
	
	public double avg() {
		return 30.0D;
	}
}
