package basics.filters;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DistinctFilters {


    public static void main(String[] args) {

        List<Person>personList = Arrays.asList(new Person(120,"Zak","zak@nodomain.com"),
                new Person(120,"Zak","bot@nodomain.com"));
        List<Person> uniqueNames = personList.stream().filter(distinctByKey(Person::getAge))
                .collect(Collectors.toList());
        System.out.println(uniqueNames);
    }
    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
}
class Person{
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    int age;
    String name;
    String email;

    public Person(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }
}


