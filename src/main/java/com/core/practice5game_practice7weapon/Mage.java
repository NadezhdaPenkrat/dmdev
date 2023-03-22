package src.main.java.com.core.practice5game_practice7weapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сделал заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
