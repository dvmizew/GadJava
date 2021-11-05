package lab2.ch1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public void attack(Fighter f){
        f.health = f.health - damagePerAttack;
    }
    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damage;
    }
}
