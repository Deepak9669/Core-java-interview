package collecton.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Shya", 5000));
		list.add(new Employee(1, "Shyam", 5000));
		list.add(new Employee(2, "Ajay", 4000));
		list.add(new Employee(4, "Anand", 3000));

		EmployeeSortByName byName = new EmployeeSortByName();

		Collections.sort(list, byName);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("<------------By Id or Name------------>");

		EmployeeSortByIdName byIdName = new EmployeeSortByIdName();

		Collections.sort(list, byIdName);

		Iterator it1 = list.iterator();

		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		System.out.println("<------------By All------------>");

		EmployeeSortIDNameSalary byAll = new EmployeeSortIDNameSalary();

		Collections.sort(list, byAll);

		Iterator it2 = list.iterator();

		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
