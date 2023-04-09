package day11;

import java.util.Random;

public class Ex16_ClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department d1 = new Department("본점");
		Department d2 = new Department("역삼점");
		Department d3 = new Department("태양점");
		Department d4 = new Department("해왕성점");
		Department d5 = new Department("Area51점");
		
//		Department[] d = new Department[5];
//		d[0] = new Department("역삼점");
		
		d1.setPranOpen(true);
		d1.setOpen();
		d2.setOpen();
		d3.setOpen();
		d4.setOpen();
		d5.setOpen();
		
		System.out.println("오늘 오픈 여부를 알려드립니다.");
		System.out.println(d1.name + " : " + (d1.getOpenStatus()? "O":"X"));
		System.out.println(d2.name + " : " + (d2.getOpenStatus()? "O":"X"));
		System.out.println(d3.name + " : " + (d3.getOpenStatus()? "O":"X"));
		System.out.println(d4.name + " : " + (d4.getOpenStatus()? "O":"X"));
		System.out.println(d5.name + " : " + (d5.getOpenStatus()? "O":"X"));
		
		// 열 번의 금액을 더한다. 단, 오픈하지 않은 지점은 제외
		// 금액은 0에서 최대 100000000으로 구하되, 1000 단위 절사(2372632 -> 2372000)
		Random rd = new Random();
		int amt;
		for(int i=0;i<10;i++) {
			if(d1.getOpenStatus()) {
				// 0에서 100000000까지의 숫자를 하나 얻는다.
				amt = rd.nextInt(100000001);
				// 1000단위 이하는 절사한다.
				amt = amt / 1000 * 1000;
				// 매출액에 더한다.
				d1.addAmt(amt);
			}
			if(d2.getOpenStatus())
				d2.addAmt(rd.nextInt(100000001) / 1000 * 1000);
			if(d3.getOpenStatus())
				d3.addAmt(rd.nextInt(100000001) / 1000 * 1000);
			if(d4.getOpenStatus())
				d4.addAmt(rd.nextInt(100000001) / 1000 * 1000);
			if(d5.getOpenStatus())
				d5.addAmt(rd.nextInt(100000001) / 1000 * 1000);
		}
		
		System.out.println();
		System.out.println("누가 가장 장사를 잘 했는가?");
		System.out.println(d1.name + " : " + d1.getAmt());
		System.out.println(d2.name + " : " + d2.getAmt());
		System.out.println(d3.name + " : " + d3.getAmt());
		System.out.println(d4.name + " : " + d4.getAmt());
		System.out.println(d5.name + " : " + d5.getAmt());
	}

}

class Department {
	// 1. name : 지점의 이름, 생성할 때 지정 가능
	// 2. pran_name : 브랜드 이름, 수정 불가능, 최초에 SSG로 세팅
	// 3. amt : 지점의 매출액, 초기값은 0. 직접 수정 불가능
	// 4. open_ind : 현재 지점의 오픈 상태(true or false)
	// 5. pran_open_ind : 전체 백화점의 오픈 가능 상태(true or false)
	
	// Step 1. Field 정의
	String name;
	static final String pran_name = "SSG";
	private int amt = 0;
	private boolean open_ind;
	private static boolean pran_open_ind;
	
	// Step 2. Constructor
	Department(){
		name = "미정";
	}
	
	Department(String name){
		this.name = name;
	}
	
	// Step 3. Getter, Setter
	public void setOpen(boolean status) {
		this.open_ind = status;
	}
	
	public void setOpen() {
		// 80%의 확률로 오픈하는 로직을 구현하시오.
		Random rd = new Random();
		int result = rd.nextInt(100) + 1;
//		System.out.println(result);
		if(result <= 80) {
			open_ind = true;
		}
		else
			open_ind = false;
	}
	
	public void setPranOpen(boolean status) {
		pran_open_ind = status;
	}
	
	public int getAmt() {
		return amt;
	}
	
	// Step 4. Method
	// amt를 더하는 method
	public void addAmt(int amt) {
		this.amt += amt;
	}
	
	// 지점의 최종 오픈 상태를 돌려주는 method
	public boolean getOpenStatus() {
		// pran_open_ind가 false이면 무조건 문닫음
		// true이면 지점의 open_ind에 따라 열고 닫음
		if(pran_open_ind && open_ind)
			return true;
		else
			return false;
	}
}
