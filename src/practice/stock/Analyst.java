package practice.stock;

public class Analyst {
    private String name;
    private String email;
    private String phone;
    
    public Analyst(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void update(Stock stock){
        System.out.println("Analyst " + this.name + " observed a change: " + stock.getName() + " stock is now " + stock.getPrice());
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Analyst [name=" + name + ", email=" + email + ", phone=" + phone + "]";
    }
}
