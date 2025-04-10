package java_basics.chap6.ex4;

public class Developer extends Employee{
    public Developer(int serialNumber, String firstName, String lastName) {
        super(serialNumber, firstName, lastName, "developer");
    }

    @Override
    public int getSalary() {
        return 1500;
    }
}
