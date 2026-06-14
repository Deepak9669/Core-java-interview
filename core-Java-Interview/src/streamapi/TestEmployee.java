package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Ram", 50000));
		list.add(new Employee("Raj", 80000));
		list.add(new Employee("Ramu", 11000));
		list.add(new Employee("Ram", 50000));

	int secondHighest = list.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(2)
				.findFirst().orElse(0);
		
		System.out.println(secondHighest);

		Employee secondHighest1 = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3)
				.findFirst().orElse(null);
	
		System.out.println(secondHighest1.getName() + " " + secondHighest1.getSalary());
		
		  List<Employee> highPaidEmployees = list.stream()
	                .filter(employee -> employee.getSalary() > 20000)
	                .collect(Collectors.toCollection(ArrayList::new));

	        highPaidEmployees.forEach(
	                     employee -> System.out.println(
	                         employee.getName() +" " + employee.getSalary())
	                    );
	}
}
