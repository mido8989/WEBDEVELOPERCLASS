package day12;

public class Ex18_SmartPhone extends Ex18_Phone {
	public void installApp() {
		System.out.println("Installing OK");
	}
	
	public void webSerfing() {
		System.out.println("Web Serfing....");
	}
	
	@Override
	public void sendText(String str) {
		System.out.println("msg : " + str);
	}
}
