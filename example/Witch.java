package example;

public class Witch extends Dude {

    Witch(String name) {
        super(name);
        this.setHp(100); // Default HP for Witch
    }
    public void castSpell(String name) {
        System.out.println(name + " casts a witch spell!");
        this.setMp(this.getMp() - 5); // Casting a spell costs 5 MP
    }

}
