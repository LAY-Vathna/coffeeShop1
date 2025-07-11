package example;

public class Game {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Hero1";

        Hero hero2 = new Hero();
        hero2.name = "Hero2";
        
        Wizard wizard1 = new Wizard();
        wizard1.name = "Wizard1";
        wizard1.sayName();
        hero1.sayName();

        GrandWizard grandWizard1 = new GrandWizard();
        grandWizard1.name = "GrandWizard1";
        grandWizard1.sayName();
        // wizard1.attack(hero1);
        ((Hero) grandWizard1).sayName();

        // System.out.println(wizard1.hp);
        // System.out.println(wizard1.mp);
        // System.out.println(wizard1.spells);
        // wizard1.castSpell("Fireball");

    }
}
