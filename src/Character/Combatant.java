package Character;

public class Combatant {
    int atk;
    int def;
    int hp;
    int level;
    String name;

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showStat(){
        System.out.println("===== " + name + "'s Stat =====");
        System.out.println("Level: " + level);
        System.out.println("Hp: " + hp);
        System.out.println("Attack level: " + atk);
        System.out.println("Defence level: " + def);
    }
}
