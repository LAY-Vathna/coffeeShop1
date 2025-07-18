package example;

public class Hero {
    private String name;
    private int mp = 0;
    private int hp = 100;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }
    

    public void sayName()
    {
        System.out.println("Hero: "+ name);
    }

    public void attack(Hero target)
    {
        System.out.println(name + " attacks " + target.name);
        target.hp = target.hp - 10;
        System.out.println(target.name + " has " + target.hp + " hp left.");
    }


    public String getName() {
        return name;
    }


    protected void setName(String name) {
        this.name = name;
    }


    protected int getMp() {
        return mp;
    }


    protected void setMp(int mp) {
        if(mp < 0 || mp > 100) {
            System.out.println("HP must be between 0 and 100");
        }else
        {
            this.mp = mp;
        }
    }


    protected int getHp() {
        return hp;
    }


    protected void setHp(int hp) {
        if(hp < 0 || hp > 100) {
            System.out.println("HP must be between 0 and 100");
        }else
        {
            this.hp = hp;
        }
    }


    
}
