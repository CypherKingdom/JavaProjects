package design_patterns.creational.exercise2;

public class CharacterBuilder {
    private Character character;

    public void reset(){
        this.character = new Character();
    }

    public void buildName(String name){
        this.character.setName(name);
    }

    public void buildHealth(int health){
        this.character.setHealth(health);
    }

    public void buildArmor(int armor){
        this.character.setArmor(armor);
    }

    public void buildWeapon(Weapon weapon){
        this.character.setWeapon(weapon);
    }

    public Character getCharacter(){
        return this.character;
    }
}
