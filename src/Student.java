public class Student extends Person{
    private double gpa;

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(){}
    public Student(String name, String surname, double gpa){
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public double getPaymentAmount() {
        if(getGpa() > 2.67) return 36660.00;
        return 0.00;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " earns " + getPaymentAmount() + " tenge";
    }
}
