package day12;

import java.util.Scanner;

public class Ex18_PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어떤 폰 사실건가요?(1.일반폰, 2.스마트폰) : ");
		int sel = sc.nextInt();
		Ex18_Phone myPhone;
		Ex18_SmartPhone newPhone;
		
		if(sel==1) {
			myPhone = new Ex18_Phone();
		}
		else {
			myPhone = new Ex18_SmartPhone();
		}
		
		myPhone.sendText("heofheiofheifheeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeoefhweiofhieohfoiehfioehfioehfiehfioheofh");
		myPhone.call();
		
		// 1, 2 선택에 따라 Casting이 불가능, 가능
		newPhone = (Ex18_SmartPhone) myPhone;
		newPhone.installApp();
		newPhone.webSerfing();
		
	}

}
