package java_basics.chap6.ex4;

import java.util.ArrayList;

public class Company {
    // private String name;
    public ArrayList<Employee> employees;

    public Company(int nbOfEmployees, String name) {
        this.employees = new ArrayList<Employee>(nbOfEmployees);
        // this.name = name;
    }

    // public boolean addEmployee(Employee e) {
    //     for (int i = 0; i < this.employees.size(); i++) {
    //         if (this.employees[i] == null) {
    //             this.employees[i] = e;
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    // For regular arrays, laen hone fi.add(), eemlnha tahet, hireEmployee()

    public int getSalary(int serialNumber) {
        for (int i = 0; i < this.employees.size(); i++) {
            if (this.employees.get(i) != null && this.employees.get(i).getSerialNumber() == serialNumber) {
                return this.employees.get(i).getSalary();
            }
        }
        return -1;
        // for(Employee e:this.employees){
        //  if(e.getSerialNumber()==serialNumber)
        //      return e.getSalary();
        // }
        // return -1;
    }

    public boolean checkEmployee(String fname, String lname) {
        for (Employee e : this.employees) {
            if (e.getFirstName().equals(fname) && e.getLastName().equals(lname)) {
                return true;
            }
        }
        return false;
    }

    public boolean fireEmployee(String fname, String lname) {
        for (Employee e : this.employees) {
            if (e.getFirstName().equals(fname) && e.getLastName().equals(lname)) {
                this.employees.remove(e);
                return true;
            }
        }
        return false;
    }

    public boolean hireEmployee(String fname, String lname, String position, int snumber) {
        Employee e;
        switch (position.toLowerCase()) {
            case "developer":
                e = new Developer(snumber, fname, lname);
                break;
            case "technician":
                e = new Technician(snumber, fname, lname);
                break;
            case "project manager":
                e = new ProjectManager(snumber, fname, lname);
                break;
            default:
                return false;
        }
        this.employees.add(e);
        return true;
    }

    public void assignManager(int pmNumber, int snumber) {
        ProjectManager p = (ProjectManager) this.findEmployee(pmNumber);
        Employee e = this.findEmployee(snumber);
        e.setMyManager(p);
    }

    public ProjectManager getManager(int snumber) {
        Employee e = this.findEmployee(snumber);
        ProjectManager p = e.getMyManager();
        return p;
    }

    public Employee findEmployee(int snumber) {
        for (Employee e : this.employees) {
            if (e.getSerialNumber() == snumber)
                return e;
        }
        return null;
    }
}
