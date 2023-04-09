package day14;

import util.MyUtil;

public class Ex23_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.setOperand(100, 27);
		c.divide();
		c.setOperand(100, 0);
		//c.divide();
		c.divideEnhanced();
		
		MyUtil.p("드디어 프로그램의 종료 성공");
		
		try {
			c.alwaysAngry(true);
		}
		catch(Exception e) {
			MyUtil.p(e.getMessage());
			e.printStackTrace();
			MyUtil.p("잼민이는 집에 가세요.");
		}
	}

}

class Calculator {
	int left, right;
	
	public void setOperand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 0으로 나눌 때 프로그램이 종료되고 마는 메서드
	public void divide() {
		MyUtil.p("[Calculator:divide()] " + (left/right));
	}
	
	// 불사신(피닉스) 메서드
	public void divideEnhanced() {
		try {
			MyUtil.p("[Calculator:divideEnhanced()] " + (left/right));
		}
		catch(Exception e) {
			MyUtil.p(e.getMessage());
			MyUtil.p(e.toString());
			e.printStackTrace();
			//System.exit(0);
			MyUtil.p("너의 실수는 계산되어 있었다.");
		}
		finally {
			MyUtil.p("오류나든지 말든지 입금좀여");
		}
	}
	
	// 예외가 발생할 수 있다고 경고 => try catch로 감싸달라는 표현
	public void alwaysAngry(boolean yn) throws Exception {
		if(yn) {
			throw new Exception("[B0001] 저 화났습니다.");
		}
		else {
			MyUtil.p("저 화 안났습니다");
		}
	}
	
}