package example;

public class GrandWizard extends Wizard{
    private int level;

    public GrandWizard(String name, int mp, int level) {
        super(name, mp);
        this.level = level;
    }

    @Override
    public void sayName() {
        // TODO Auto-generated method stub
        System.out.println("Grand Wizard: " + this.getName() + ", Level: " + level);
    }
    
    public void castAdvanceSpell()
    {
        System.out.println("Casting an advanced spell!");
        this.setMp(this.getMp() - 20); // Casting an advanced spell costs 20 MP
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "GrandWizard [level=" + level + "]";
    }
}
