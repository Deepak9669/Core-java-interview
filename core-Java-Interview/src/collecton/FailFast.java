package collecton;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

public class FailFast {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Ram");
		list.add("Shyam");
		list.add("Lakhan");

		System.out.println(list);

		Iterator it = list.iterator();
		
		
		list.add("Lakhan");
	

		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	}
}
