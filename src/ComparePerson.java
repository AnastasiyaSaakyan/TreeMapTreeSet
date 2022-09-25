import java.util.Comparator;

public class ComparePerson<P extends Person> implements Comparator<P> {
    private int maxWords;

        public ComparePerson(int maxWords) {
            this.maxWords = maxWords;
        }

        @Override
        public int compare(Person o1, Person o2) {
            int length1 = o1.getSurname().split("\\P{IsAlphabetic}+").length;
            int length2 = o2.getSurname().split("\\P{IsAlphabetic}+").length;
            int length = length1 - length2;
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
        }
    }