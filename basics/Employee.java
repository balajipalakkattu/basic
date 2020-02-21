package streams.basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {

	private String name;
	private char sex;
	private byte age;

	public Employee(String name, char sex, byte age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public static void main(String[] a) {
		List<Employee> list = Arrays.asList(
				new Employee("Name1", 'F', (byte) 100),
				new Employee("Name10", 'F', (byte) 12),
				new Employee("Name1", 'M', (byte) 2));
		
		list.sort(Comparator.comparing(Employee::getName));
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		
		list.sort(Comparator.
				comparing(Employee::getName)
				.thenComparing(Employee::getAge)
				.thenComparing(Employee::getSex)
				);
		list.forEach(System.out::println);
	}
}
