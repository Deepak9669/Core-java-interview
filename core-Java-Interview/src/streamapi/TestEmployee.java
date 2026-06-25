package streamapi;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 50000));
		list.add(new Employee("Raj", 80000));
		list.add(new Employee("Ramu", 11000));
		list.add(new Employee("Ram", 50000));

//	int secondHighest = list.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1)
//				.findFirst().orElse(null);
//		
//		System.out.println(secondHighest);

		list.stream().map(e -> e.getSalary()).sorted().limit(1)
				.forEach(System.out::println);

	}
}
