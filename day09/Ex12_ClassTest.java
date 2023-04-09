package day09;

import util.MyUtil;

public class Ex12_ClassTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MyUtil u = new MyUtil();
		System.out.println(MyUtil.RED + "Class Test" + MyUtil.END);
		MyUtil.p("Static Method");
		
		Ex11_ClassPerson p1 = new Ex11_ClassPerson();
		p1.age = 900;
		p1.name = "Adam";
		p1.eat();
		
		Ex11_ClassPerson p2 = new Ex11_ClassPerson("Poiret");
		System.out.println("name : " + p2.name);
		System.out.println("age  : " + p2.age);
		
		Ex11_ClassPerson p3 = new Ex11_ClassPerson("Jang", 19);
		System.out.println("name : " + p3.name);
		System.out.println("age  : " + p3.age);
		
		Car car1 = new Car();
		Car car2 = new Car("black", "Bugatti", "Luxury");
		car1.describe();
		car2.describe();
		
	}
}

class Car {
	String color;
	String name;
	String type;
	
	Car(){
		color = "Not Defined";
		name = "Secret";
		type = "Basic";
	}
	
	Car(String color, String name, String type){
		this.color = color;
		this.name = name;
		this.type = type;
	}
	
	public void describe() {
		System.out.println("[Car] 이 차로 말씀드리면 이름은 " + name + "이고,");
		System.out.println("[Car] 타입은 " + type + "형입니다.");
		System.out.println("[Car] 색상은 누구나 좋아할만한 " + color + "입니다.");
	}
}



