package src.main.java.com.core.practice5game_practice7weapon;

//generics in methods
public class WeaponRunner {

    public static void main(String[] args) {

        Archer<Bow> archer = new Archer<>("legolas", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("boromir", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(archer);
        printWeaponDamage(warrior);

    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }

}
