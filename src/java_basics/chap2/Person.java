package java_basics.chap2;

public class Person {
     //fields
    public static int counter;
    private String firstName, lastName;
    private int age;

    //constructors
    public Person(String fName, String lName, int age){
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;
        counter++;
    }

    public Person() {
        this.firstName = "Patrick";
        this.lastName = "Melki";
        this.age = 69;
        counter++;
    }

    //methods
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String x) {
        this.firstName = x;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String x) {
        this.lastName = x;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int x) {
        this.age = x;
    }
}
