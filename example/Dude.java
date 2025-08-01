package example;

public class Dude {
    private String name;
    private int mp = 0;
    private int hp = 100;

    
    public Dude(String name) {
        setName(name);
        setHp(100);
    }

    public void attack(Dude target)
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
            this.hp = 100;
        }
    }

    public void sayName() {
        System.out.println("Dude: " + this.name);
    } 
      
     @Override
    public String toString() {
        return "Player name=" + name +", hp=" + hp;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if(obj instanceof Dude) {
            Dude other = (Dude) obj;
            if(this.name.equals(other.name) && this.hp == other.hp)
            {
                return true;
            }
            else
            {
                System.out.println(this.name + this.hp);
                System.out.println(other.name + other.hp);
                System.out.println("hi");
                return false;
            }
        }else
        {
            
                System.out.println("hii");
            return false;
        }
    }

    
    
}
