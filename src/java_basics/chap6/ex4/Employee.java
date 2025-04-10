package java_basics.chap6.ex4;

public abstract class Employee {
    private int serialNumber;
    private String firstName, lastName, jobDesc;
    private ProjectManager myManager;

    public Employee(int serialNumber, String firstName, String lastName, String jobDesc) {
        this.serialNumber = serialNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobDesc = jobDesc;
    }

    public ProjectManager getMyManager() {
        return this.myManager;
    }

    public void setMyManager(ProjectManager x) {
        this.myManager = x;
    }

    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getJobDesc() {
        return this.jobDesc;
    }

    public abstract int getSalary();

    @Override
    public String toString() {
        return "Employee serialNumber =" + serialNumber + ", firstName=" + firstName + ", lastName=" + lastName
                + ", jobDescription=" + jobDesc;
    }
}
