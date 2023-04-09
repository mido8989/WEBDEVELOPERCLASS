package day09;

public class Ex11_ClassPerson {
	// Field
	public int age;
	String name = "NO NAME";
	
	// Method
	public static void hit() {
		System.out.println("주인님 좀 때리도록 하겠습니다.");
	}
	
	public void eat() {
		System.out.println("저 " + name + "은 소갈비 1.4kg를 먹고 있습니다.");
	}
	
	
	// Constructor
	
	Ex11_ClassPerson(){
		System.out.println("[Person] Created~~");
	}
	
	Ex11_ClassPerson(String nam){
		name = nam;
		System.out.println("[Person] " + name + " Created~~");
		if(name == "Poiret") {
			age = 1000;
		}
	}
	
	// 이름과 나이를 입력할 수 있는 Constructor를 만드시오.
	Ex11_ClassPerson(String nam, int ag){
		name = nam;
		age = ag;
		System.out.println("[Person] " + name + "(" + age + ") Created~~");
	}
	
}


