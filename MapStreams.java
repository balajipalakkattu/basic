package basics.filters;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreams {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();
        map.put(123456,"Design Patterns");
        map.put(1234567,"Java Design Patterns");
        map.put(12345678,"Java8 Stream API");

        System.out.println(
        map.entrySet().stream()
                .filter(e->e.getValue().equals("Java Design Patterns"))
                .map(Map.Entry::getKey)
                .findFirst().get());

        System.out.println(
        map.entrySet().stream()
                .filter(e->e.getValue().contains("Design Patterns"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));

        System.out.println(
        map.entrySet().stream()
                .filter(e->e.getKey().toString().contains("67"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList()));

        listToMap();

        listToMapDuplicateKey();

        listToConcurrentMap();

        listToTreeMap(); // Sorted Map
    }

    private static void listToTreeMap() {

        List<Person>personList = Arrays.asList(new Person(2212,"Zak",""),
                new Person(112,"Zak-bot","n/a"));
        System.out.println( personList.stream().collect(Collectors.toMap(p->p.getAge(),p->p,(o1,o2)->o1,TreeMap::new)).entrySet());
    }

    private static void listToConcurrentMap() {
        List<Person>personList = Arrays.asList(new Person(12,"Zak",""),new Person(112,"Zak-bot","n/a"));
        System.out.println( personList.stream().collect(Collectors.toConcurrentMap(p->p.getAge(),p->p)));
    }

    private static void listToMapDuplicateKey() {
        List<Person>personList = Arrays.asList(new Person(12,"Zak",""),new Person(12,"Zak-bot","n/a"));
        System.out.println( personList.stream().collect(Collectors.toMap(p->p.getAge(),p->p,(o1,o2)->o2)));
    }

    private static void listToMap(){
        List<Person>personList = Arrays.asList(new Person(12,"Zak",""),new Person(21,"Zak-bot","n/a"));
        System.out.println( personList.stream().collect(Collectors.toMap(p->p.getAge(),p->p)));

    }
}
