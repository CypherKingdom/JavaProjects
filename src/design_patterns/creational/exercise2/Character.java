package design_patterns.creational.exercise2;

public class Character {
    private String name;
    private int health;
    private int armor;
    private Weapon weapon;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    public String toString() {
        return "Character [name=" + name + ", health=" + health + ", armor=" + armor + ", weapon=" + weapon + "]";
    }
}
