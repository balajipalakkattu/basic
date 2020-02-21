package streams.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ApplyStreamAPI {
	public static void main(String... a) {

		List<Employee> list = Arrays.asList(
				new Employee("Name1", 'M', (byte) 10),
				new Employee("Name10", 'F', (byte) 12),
				new Employee("Name1", 'F', (byte) 100));
		// Use stream to sort
		list.stream()
		.sorted(Comparator
				.comparing(Employee::getName)
				.thenComparing(Employee::getSex)
				.thenComparing(Employee::getAge)
				)
		.forEach(System.out::println);
	// Collectors
	List<Employee>sortedList = list.stream().sorted(Comparator
			.comparing(Employee::getName))
	.collect(Collectors.toList());
	System.out.println();
	sortedList.forEach(System.out::println);
	 
	IntStream
			.iterate(0,n-> n+2 )
			.limit(5).forEach(System.out::print);
	System.out.println("Find First or 100, "+
			Arrays.asList(new Employee("", 'A', (byte) 0))
			.stream()
			.filter(em->em.getAge() == 10)
			
	.findFirst().orElse(new Employee("unknown", 'u', (byte) 0)));
	}
}
