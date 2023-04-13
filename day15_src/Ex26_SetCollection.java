package day15;

import java.util.HashSet;
import java.util.Iterator;

public class Ex26_SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. HashSet
		HashSet<String> movies = new HashSet();
		
		// (1) add()로 데이터 저장
		movies.add("매트릭스");
		movies.add("주글래살래");
		movies.add("쇼생크탈출");
		System.out.println(movies.add("죠스"));
		System.out.println(movies.add("죠스"));
		
		System.out.println(movies);
		
		Iterator iter = movies.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// (2) remove는 Object로만 가능(인덱스가 없으므로)
		movies.remove("매트릭스");
		System.out.println(movies.remove("슬램덩크"));  // 없는 것 지우라고 하면 false
		System.out.println("삭제 후 : " + movies);
		
		// (3) 내 클래스 이용해보기
		HashSet<Dog> bucket = new HashSet();
		
		Dog myDog = new Dog();
		myDog.name = "Happy";
		myDog.age = 3;
		System.out.println(myDog);
		
		bucket.add(myDog);
		
		Dog yourDog = new Dog();
		yourDog.name = "Happy";
		yourDog.age = 3;
		
		//bucket.remove(myDog);
		bucket.remove(yourDog);
		
		System.out.println("*** 내 강아지 탈출 후 ***");
		System.out.println(bucket);
	}
		
}
	
class Dog {
	String name;
	int age;
		
	public String toString() {
		return "이 강아지는 " + name + "(" + age + ") 입니다.";
	}
}
