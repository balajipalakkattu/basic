package streams.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {

	private String name;
	private char sex;
	private byte age;

	public Person(String name, char sex, byte age) {
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

	@Override
	public int compareTo(Person person) {

		return this.age > person.age ? 1 : this.age < person.age ? -1 : 0;
	}

	public static void main(String[] a) {
		List<Person> list = Arrays.asList(new Person("Name1", 'M', (byte) 100),
				new Person("Name10", 'F', (byte) 12),
				new Person("Name1", 'M', (byte) 2));
		Collections.sort(list);
		list.forEach(System.out::println);
		
		list.sort(Comparator.comparing(Person::getName));
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		
		list.sort(Comparator.
				comparing(Person::getName)
				.thenComparing(Person::getAge)
				);
		list.forEach(System.out::println);
	}
}
