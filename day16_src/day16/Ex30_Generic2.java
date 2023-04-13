package day16;

import java.util.ArrayList;

public class Ex30_Generic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LuxuryBox<Instrument> box1 = new LuxuryBox();
		LuxuryBox<Violin> box2 = new LuxuryBox();
		// LuxuryBox<Bat> box3 = new LuxuryBox();
		
		String result = box1.<String>get("Cello");
		System.out.println(result);
		Bat v = box1.<Bat>get(new Bat());
		System.out.println(v);
	}

}

class Instrument {
	
}

class Violin extends Instrument {
	
}

class Flute extends Instrument {
	
}

class SportsTool {

}

class Bat extends SportsTool {
	
}

class LuxuryBox<T extends Instrument> {
	ArrayList<T> item = new ArrayList();
	
	public <T> T get (T str) {
		return str;
	}
}

