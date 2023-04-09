package day10;

import util.MyUtil;

public class Ex13_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.add(3, 5);
		c.add(3.4, 8.8);
		int[] aaa = {1, 3, 5, 100, 254232, 1232};
		int result = c.add(aaa);
		MyUtil.p("[모든 수의 결과] *** " + result + " ***");
	}

}

class Calc {
	public void add(int a, int b) {
		MyUtil.p("[add(int)] " + (a+b));
	}
	
	public void add(double a, double b) {
		MyUtil.p("[add(double)] " + (a+b));
	}
	
	public int add(int[] a) {
		// 결과를 출력해보십시오.
		int sum = 0;
		
//		for(int i=0;i<a.length;i++)
//			sum += a[i];

		// Enhanced for
		for(int i : a)
			sum += i;
		
		MyUtil.p("[add(int[])] " + sum);
		
		return sum;
	}
}
