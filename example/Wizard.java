package example;


import java.util.ArrayList;


public class Wizard extends Hero{
    ArrayList<String> spells = new ArrayList<>();
    public Wizard(String name, int mp) {
        super(name); // Call the Hero constructor with default values
        this.setHp(mp);
        spells.add("Fireball");
        spells.add("Lightning Bolt");
    }

    public void castSpell(String name)
    {
        
        System.out.println(name + " casts a spell!");
        this.setMp(this.getMp() - 10); // Casting a spell costs 10 MP
    }
    
    public void sayName() {
        // TODO Auto-generated method stub
       System.out.println("Wizard: " + this.getName());
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getName() + " has " + this.getHp() + " HP and " + this.getMp() + " MP.";
    }
}