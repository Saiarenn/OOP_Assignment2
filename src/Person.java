public abstract class Person implements Payable, Comparable<Person> {
    private int id;
    private static int id1 = 1;
    private String name;
    private String surname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Person() {
        this.id=id1++;
    }
    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + getName() + " " + getSurname();
    }

    public String getPosition() {
        Employee employee = new Employee();
        return employee.getPosition();
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(getPaymentAmount(), person.getPaymentAmount());
    }
}
