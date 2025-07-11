package example;

import java.util.ArrayList;

//what
//how--
//why

public class Wizard extends Hero{
    ArrayList<String> spells = new ArrayList<>();
    public Wizard() {
        this.mp = 100; // Wizards start with 100 MP
        spells.add("Fireball");
        spells.add("Lightning Bolt");
    }

    public void castSpell(String name)
    {
        
        System.out.println(name + " casts a spell!");
        this.mp -= 10; // Casting a spell costs 10 MP
    }
    
    public void sayName() {
        // TODO Auto-generated method stub
       System.out.println("Wizard: " + name);
    }
}