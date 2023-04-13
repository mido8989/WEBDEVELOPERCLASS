package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex24_ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// 1. ArrayList
		ArrayList<String> arr = new ArrayList();
		
		// (1) 리스트에 요소(element) 저장하기
		arr.add("돈까스");
		arr.add("치킨까스");
		arr.add("쌀국수");
		arr.add("라면");
		// arr.add(12349876);  // String(Generic)으로 제한이 걸려있어서 오류
		
		System.out.println(arr + " : " + arr.size());
		
		for(int i=0;i<arr.size();i++) {
			System.out.println((i+1)+"번째 메뉴 : " + arr.get(i));
		}
		
		// (2) 요소 삭제하기
		arr.remove(1);
		arr.remove("돈까스");
		
		System.out.println("");
		System.out.println("*** 메뉴 삭제 2개 후 ***");
		for(String menu : arr) {
			System.out.println(menu);
		}
		
		// (3) 요소 변경하기
		arr.set(0, "스파게티");
		System.out.println("\n요소 변경 후 : " + arr);
		
		// (4) Iterator
		Iterator iter = arr.iterator();
		System.out.println("\n요소 변경 후 : ");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// (5) size() : 요소의 개수 알아보기
		System.out.println("저희 가게의 총 메뉴는 " + arr.size() + "개 입니다.");
		
		// (6) contains() : 요소 있는지 알아보기
		System.out.println("라면 있나요?? " + (arr.contains("라면")? "응":"없어"));
		System.out.println("돈까스 있나요?? " + (arr.contains("돈까스")? "응":"없어"));
		
		// 2. LinkedList
		LinkedList link = new LinkedList();
		link.add("스즈메의문단속");
		link.add(0, "교섭");
		link.add(1, "아바타:물의길");
		
		System.out.println();
		System.out.println(link);
	}

}
