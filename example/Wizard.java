package example;


import java.util.ArrayList;


public class Wizard extends Dude{
    protected ArrayList<String> spells = new ArrayList<>();
    
    public Wizard(String name, int mp) {
        super(name); // Call the Hero constructor with default values
        this.setHp(mp);
        spells.add( "Fireball");
        spells.add("Lightning Bolt");
    }

    public void castSpell(String name)
    {
        
        System.out.println(name + " casts a spell!");
        this.setMp(this.getMp() - 10); // Casting a spell costs 10 MP
    }
    @Override
    public void sayName() {
        // TODO Auto-generated method stub
       System.out.println("Wizard: " + this.getName());
    }

    @Override
    public String toString() {
        return super.toString()+ "Wizard [spells=" + spells + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Wizard) {
            Wizard other = (Wizard) obj;
            if(super.equals(obj) && this.spells.equals(((Wizard)obj).spells)) {
                return true;
            }
        }
        return false;
    }
    public boolean equals(Dude obj) {
        return super.equals(obj);
    }
    
}