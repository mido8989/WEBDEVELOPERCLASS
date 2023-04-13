package day16;

import java.util.ArrayList;

public class Ex29_Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OldBox ob = new OldBox();
		Food ramen = new Food("라면","그냥 끓여");
		ob.add(ramen);
		System.out.println(((Food)ob.get(0)).getRecipe());
		
		NewBox<Food> nb = new NewBox();
		nb.add(ramen);
		System.out.println(nb.get(0).getRecipe());
		
		StrangeBox<String> sb = new StrangeBox();
	}
}

class Food {
	String name;
	String recipe;
	
	Food(String name, String recipe){
		this.name = name;
		this.recipe = recipe;
	}
	
	String getRecipe() {
		return recipe;
	}
}

class OldBox {
	ArrayList item = new ArrayList();
	
	void add(Object o) { item.add(o); }
	Object get(int index) { return item.get(index); }
}

class NewBox<T> {
	// T : type, E : element, K : key, V : value
	ArrayList<T> item = new ArrayList();
	
	void add(T o) { item.add(o); }
	T get(int index) { return item.get(index); }	
}

class StrangeBox<DisneyLand>{
	DisneyLand name;
}
