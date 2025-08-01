

import example.GrandWizard;

import java.util.ArrayList;

import example.Dude;
import example.Wizard;

public class Game {
    public static void main(String[] args) {

        Dude dude1 = new Dude("Gandalf");
        //account

        Wizard wizard1 = new Wizard("Gandalf", 50);
        //employee
         Wizard wizard2 = new Wizard("Gandalf", 50);
        //employee
        GrandWizard grandWizard1 = new GrandWizard("Gandalf", 50, 5);

        Dude dude2 = new Dude("Gandalf");
        
        System.out.println(dude1.equals(wizard1));
        System.out.println(wizard1.equals(dude1));
        // GrandWizard grandWizard1 = new GrandWizard("Saruman", 100, 5);
        // wizard1.castSpell("Fireball");

        
        // String s = new String("Hello");
        // System.out.println(s);
        // System.out.println(dude1);
        // System.out.println(wizard1);

        // ArrayList<Dude> dudeList = new ArrayList<>();
        // dudeList.add(dude1);
        // dudeList.add(wizard1);
        // dudeList.add(grandWizard1);


        // for (Dude dude : dudeList) {
        //     if (dude instanceof GrandWizard) {
        //         System.out.println("Grandwizard");
        //     }else if(dude instanceof Wizard) {
        //         System.out.println("wizard");
        //     }else
        //     {
        //         System.out.println("Dude");
        //     }
        // }

        // Dude hero1 = new Dude("Aragorn");
        // System.out.println(hero1);

        // Hero hero2 = new Hero();
        // hero2.name = "Hero2";
        
        // Wizard wizard1 = new Wizard();
        // wizard1.name = "Wizard1";
        // wizard1.hp = 10000000;
        // wizard1.mp = 1000000;
        // wizard1.sayName();
        // hero1.sayName();

        // GrandWizard grandWizard1 = new GrandWizard();
        // grandWizard1.name = "GrandWizard1";
        // grandWizard1.sayName();
        // wizard1.attack(hero1);
        // ((Hero) grandWizard1).sayName();

        // System.out.println(wizard1.hp);
        // System.out.println(wizard1.mp);
        // System.out.println(wizard1.spells);
        // wizard1.castSpell("Fireball");

    }
}
