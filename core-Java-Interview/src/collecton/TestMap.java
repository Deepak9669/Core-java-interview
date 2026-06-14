package collecton;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(null, "Three");
		map.put(null, "T");

//		map.clear();
		
//		map.remove(1);
		
		System.out.println(map.get(1));
		
		System.out.println(map.containsKey(1));
		
		System.out.println(map.containsValue("Two"));

		System.out.println(map);
		
		

	}
}
