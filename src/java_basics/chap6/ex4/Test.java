package java_basics.chap6.ex4;

public class Test {
    public static void main(String[] args) {
        // Company c = new Company(10, "LV");
        // Employee e1 = new Developer(1, "Lalalisa", "Manobal", "Queen1");
        // Employee e0 = new ProjectManager(0, "Taylor", "Swift", "Queen0");
        // c.addEmployee(e0);
        // c.addEmployee(e1);
        // System.out.println(e0.getFirstName() + " " + e0.getLastName() + " gets more
        // than " + c.getSalary(0) + "$");
        Company c = new Company(20, "LV");
        c.hireEmployee("Taylor", "Swift", "developper", 1989);
        c.hireEmployee("Lisa", "Manobal", "developper", 1997);
        c.hireEmployee("Bada", "Lee", "project manager", 2005);
        c.hireEmployee("Taehyung", "Kim", "developper", 1995);

        System.out.println(c.checkEmployee("Taylor", "Swift"));
        c.assignManager(2005, 1997);
        System.out.println(c.getManager(1997));
    }
}
