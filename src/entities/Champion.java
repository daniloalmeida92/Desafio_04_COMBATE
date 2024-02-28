package entities;

public class Champion {

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(){

    }

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAttack() {
        return attack;
    }

    public int getArmor() {
        return armor;
    }

    public void takeDamage(Champion other) {
        int atackOther = Math.max(1, other.getAttack() - this.armor);
        this.life -= atackOther;
    }

    public String status() {
        if (this.life < 0) {
            this.life = 0;
        }
        if (this.life <= 0)
        {
            return getName() + ": " + getLife() + " de vida (Morreu)";
        } else {
            return getName() + ": " + getLife() + " de vida";
        }
    }
}
