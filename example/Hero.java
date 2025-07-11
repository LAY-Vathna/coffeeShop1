package example;

public class Hero {
    public String name;
    public int mp = 0;
    public int hp = 100;

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
}
