package src.main.java.com.core.practice5game_practice7weapon;
//inner and nested classes
public class Enemy implements Mortal {

    int health;
    String name;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб");
        } else {
            health -= Math.min(health, damage);
            System.out.println(name + " получил урон - " + damage + ". Осталось " + health);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
