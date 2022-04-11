package mapsample;

import java.util.*;

public class EqualsAndHashCode {

    public static void main(String[] args) {
        Person a = new Person("상현", "28");
        Person b = new Person("상현", "28");

        Set<Person> set = new HashSet<>();
        set.add(a);
        set.add(b);

        Iterator<Person> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        Map<Person, Integer> map = new HashMap<>();
        map.put(a, 1);
        map.put(b, 2);

        Iterator<Person> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println("person = " + person);
            System.out.println(map.get(person));
        }

    }


    static class Person {
        private String name;
        private String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(age, person.age);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }

}
