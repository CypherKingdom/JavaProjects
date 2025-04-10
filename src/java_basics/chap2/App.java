package java_basics.chap2;
public class App {
    public static void main(String[] args) throws Exception {

        Person p = new Person("Tuna", "Helper", 20);

        Person p1 = new Person("Joe", "Missisian", 19);

        Person p2 = new Person("Thea", "Naser", 20);

        Person p3 = new Person();

        System.out.println(" ");
        System.out.println(p.getFirstName() + " " + p.getLastName() + " age: " + p.getAge());
        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " age: " + p1.getAge());
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " age: " + p2.getAge());
        System.out.println(p3.getFirstName() + " " + p3.getLastName() + " age: " + p3.getAge());
        System.out.println(" ");
        System.out.println("Nb of people: " + Person.counter);
        System.out.println(" ");
        System.out.println("Example Static: ");
        System.out.println(" ");
    }
}
