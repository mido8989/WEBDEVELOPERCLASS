package day12;

public class Ex18_Phone {
	public void call() {
		System.out.println("[Phone] Calling....");
	}
	
	public void sendText(String str) {
		if(str.length() > 80) {
			System.out.println("문자열이 너무 깁니다 손님");
		}
		else {
			System.out.println("msg : " + str);
		}
	}
}
