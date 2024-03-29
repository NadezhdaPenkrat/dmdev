package src.main.java.com.core.practice5game_practice7weapon;

public abstract class Hero<T extends Weapon> {

    private String name;
    private int damage;
    private T weapon;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }
}
