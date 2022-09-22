import java.util.Comparator;

public class Person implements Comparator<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return name + " " + surname + " , " + age;
    }

    private int maxWords;

    public Person(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int length1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
        int length2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
        int Length = length1 - length2;
        if (length1 > maxWords && length2 > maxWords) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            if (Length > 0) {
                return 1;
            } else if (Length < 0) {
                return -1;
            } else {
                int Age = o1.getAge() - o2.getAge();
                if (Age > 0) {
                    return 1;
                } else if (Age < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}