package Character;

import java.util.Random;

public class Enemy extends Combatant {
    public Enemy(int playerLevel, String name) {
        this.name = name;
        Random rand = new Random();

        this.level = rand.nextInt(playerLevel, playerLevel+2);
        this.hp = (int) (level * 10 * 0.6);
        this.atk = level;
        this.def = level;
    }
}
