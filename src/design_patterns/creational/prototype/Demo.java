package design_patterns.creational.prototype;

public class Demo {
    public static void main(String[] args) {
        Certificate certificate = Registry.getCertificate("Birth");
        System.out.println(certificate);
    }
}
