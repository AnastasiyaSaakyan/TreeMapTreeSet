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

        System.out.println(people);
        Collections.sort(people, (o1, o2) -> {
            int length1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int length2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            int length = length1 - length2;
            int maxWords = 2;
            if (length1 > maxWords && length2 > maxWords) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else {
                if (length > 0) {
                    return 1;
                } else if (length < 0) {
                    return -1;
                } else {
                    int age = o1.getAge() - o2.getAge();
                    if (age > 0) {
                        return 1;
                    } else if (age < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });
        System.out.println("Сортировка по возрастанию знатности:");
        System.out.println(people);
    }
}