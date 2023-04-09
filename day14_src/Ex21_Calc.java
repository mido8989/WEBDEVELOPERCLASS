package day14;

import util.MyUtil;

public class Ex21_Calc implements Ex21_CalIf {
	int left;
	int right;
	int center;
	
	public void setOperand(int aaa, int bbb, int ccc) {
		this.left = aaa;
		this.right = bbb;
		this.center = ccc;
	}
	
	public int sum() {
		MyUtil.p("[Ex21_Calc:sum()] Called");
		return left + right + center;
	}
	
	public double avg() {
		MyUtil.p("[Ex21_Calc:avg()] Called");
		//return (left + right + center) / 3;
		return sum() / 3D;
	}
}
