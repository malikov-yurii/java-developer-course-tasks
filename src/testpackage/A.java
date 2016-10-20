package testpackage;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class A {
    public static void main(String[] args) {

        class Person {
            String firstName;
            String lastName;

            Person() {}

            Person(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }

        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        System.out.println(comparator.compare(p1, p2));             // > 0
        System.out.println(comparator.reversed().compare(p1, p2));
        System.out.println("JoHn".compareTo("Alice"));
    }

}
