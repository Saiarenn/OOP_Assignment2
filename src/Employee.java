public class Employee extends Person{
    private String position;
    private double salary;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee (){}
    public Employee (String name, String surname, String position, double salary){
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}
