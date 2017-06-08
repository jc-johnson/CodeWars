package src.main.java.TwoFightersOneWinner;

/**
 * Created by Jordan on 6/8/2017.
 */
public class Solution {

    public static class Fighter {
        public String name;
        public int health;
        public int damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        if (fighter1.name == firstAttacker) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health + " health.");
                if (fighter2.health <= 0) return fighter1.name;
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health + " health.");
                if (fighter1.health <= 0) return fighter2.name;
            }
        }

        if (fighter2.name == firstAttacker) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
                System.out.println(fighter2.name + " attacks " + fighter1.name + "; " + fighter1.name + " now has " + fighter1.health + " health.");
                if (fighter1.health <= 0) return fighter2.name;
                fighter2.health = fighter2.health - fighter1.damagePerAttack;
                System.out.println(fighter1.name + " attacks " + fighter2.name + "; " + fighter2.name + " now has " + fighter2.health + " health.");
                if (fighter2.health <= 0) return fighter1.name;
            }
        }

        // declare winner
        return "";
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Jordan", 20, 5);
        Fighter fighter2 = new Fighter("Sam", 25, 3);

        String winner;
        // winner = declareWinner(fighter1, fighter2, "Jordan");
        // System.out.println(winner);

        Fighter fighter3 = new Fighter("Lew", 10, 2);
        Fighter fighter4 = new Fighter("Harry", 5, 4);
        winner = declareWinner(fighter3, fighter4, "Lew");
        System.out.println(winner);

    }
}
