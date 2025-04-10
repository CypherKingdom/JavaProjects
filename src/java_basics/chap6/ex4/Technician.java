package java_basics.chap6.ex4;

public class Technician extends Employee {
    public Technician(int serialNumber, String firstName, String lastName) {
        super(serialNumber, firstName, lastName, "technician");
    }

    @Override
    public int getSalary() {
        return 1000;
    }
}
