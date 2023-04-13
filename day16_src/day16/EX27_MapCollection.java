package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class EX27_MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> hm = new HashMap();
		TreeMap<String, Integer> tm = new TreeMap();
		
		// (1) put() : 데이터 저장
		String[] food = {"Steak","Chicken","Spaghetti","Rice","Curri"};
		int[] price = {10000, 15000, 9000, 2000, 500};
		
		for(int i=0;i<food.length;i++) {
			hm.put(food[i], price[i]);
			tm.put(food[i], price[i]);
		}
		
		System.out.println("hm" + hm);
		System.out.println("tm" + tm);
		
		// 2. get() : 데이터 조회
		// (1) enhanced for
		System.out.println("HashMap : " + hm.keySet());
		for(String key : hm.keySet()) {
			System.out.println(key + " : " + hm.get(key));
		}
		System.out.println("\n");
		
		// (2) Iterator
		System.out.println("TreeMap : " + tm.keySet());
		Iterator keys = tm.keySet().iterator();
		while(keys.hasNext()) {
			String key = (String)keys.next();
			System.out.println(key + " : " + tm.get(key));
		}
		System.out.println();
		
		tm.put("Curri", 5000);
		System.out.println(tm);
		
		// 3. remove() : 데이터 삭제, replace() : 데이터 변경
		System.out.println("HashMap Store changed the menu!!!");
		hm.remove("Rice");
		hm.replace("Steak", 1000);
		System.out.println(hm);
	}

}
