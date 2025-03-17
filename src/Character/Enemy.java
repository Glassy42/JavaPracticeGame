package Character;

import java.util.Random;

public class Enemy extends Combatant {
    public Enemy(int playerLevel, String name) {
        this.name = name;
        Random rand = new Random();

        this.level = rand.nextInt(playerLevel, playerLevel+2);
        this.hp = (int) (level * 10 * 0.8);
        this.atk = level;
        this.def = level;
    }

    public void showStat() {
        System.out.println("===== Monster's Stat =====");
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.hp);
        System.out.println("Attack Level: " + this.atk);
        System.out.println("Defence Level: " + this.def);
    }
}
