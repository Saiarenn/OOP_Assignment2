import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Singer", 9999999.99));
        people.add(new Student("Paul", "McCartney", 2.58));
        people.add(new Student("Saken", "Oralkhan", 3.94));
        people.add(new Employee("George", "Harrison", "Musician", 999999));
        people.add(new Student("Arman"  ,"Zhumabek" , 2.67));

        Collections.sort(people);
        printData(people);
    }
    public static void printData(Iterable <Person> people) {
        for (Person p : people) {
            System.out.println(p);
        }
    }
}