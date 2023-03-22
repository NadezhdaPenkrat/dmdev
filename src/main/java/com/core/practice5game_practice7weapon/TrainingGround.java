package src.main.java.com.core.practice5game_practice7weapon;

public class TrainingGround {

    public static void main(String[] args) {

        Hero archer = new Archer("Legolas", 15);
        Hero mage = new Mage("Gendolf", 10);
        Hero warrior = new Warrior("Boromir", 20);
        Enemy enemy = new Enemy("Зомби", 100);

        print(enemy, archer, warrior, mage);

    }

    public static void print(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                hero.attackEnemy(enemy);
            }
        }
    }
}
