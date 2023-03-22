package src.main.java.com.core.practice5game;

import src.main.java.com.core.practice7weapon.MagicWeapon;

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
