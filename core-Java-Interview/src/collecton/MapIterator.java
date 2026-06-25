package collecton;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapIterator {

	private static final String Integer = null;
	private static final boolean String = false;

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Ram");
		m.put(2, "Shyam");
		m.put(4, "Lakhan");
		m.put(5, null);

//		System.out.println(m);

//		for (Object o : m.entrySet()) {
//			System.out.println(o);
//		}
//
//		for (Object o : m.values()) {
//			System.out.println(o);
//		}
//
//		for (Object o : m.keySet()) {
//			System.out.println(o);
//		}

		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
		
//		
//		TreeMap t = new TreeMap();
//		t.put(1, "Ram");
//		t.put(3, "Shyam");
//		t.put(2, "Lakhan");
//		t.put(4, null);
//		t.put(5, null);

//		for (Object o : t.keySet()) {
//			System.out.println(o);
//		}
//
//		for (Object o : t.entrySet()) {
//			System.out.println(o);
//		}
	}
}
