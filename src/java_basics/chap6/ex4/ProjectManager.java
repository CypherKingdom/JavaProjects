package java_basics.chap6.ex4;
public class ProjectManager extends Employee {
    public ProjectManager(int serialNumber, String firstName, String lastName) {
        super(serialNumber, firstName, lastName, "project manager");
    }

    @Override
    public int getSalary() {
        return 3000;
    }
}
