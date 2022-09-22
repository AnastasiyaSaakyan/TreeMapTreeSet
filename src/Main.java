import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Ivan", "Sividov", 25));
        people.add(new Person("Nadya", "Ivanova", 16));
        people.add(new Person("Vladimir", "Kuznecov", 38));
        people.add(new Person("Veronika", "Soboleva", 18));
        people.add(new Person("Mark", "Kostilev", 14));
        System.out.println(people);
        System.out.println();


        Collections.sort(people, new Person(2));
        System.out.println(people);
    }
}