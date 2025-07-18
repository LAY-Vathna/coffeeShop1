package example;

public class GrandWizard extends Wizard{
    private int level;

    public GrandWizard(String name, int mp, int level) {
        super(name, mp);
        this.level = level;
        spells.add("Meteor Shower");
        spells.add("Arcane Blast");
    }

    @Override
    public void sayName() {
        // TODO Auto-generated method stub
        System.out.println("Grand Wizard: " + name);
    }
    
}
