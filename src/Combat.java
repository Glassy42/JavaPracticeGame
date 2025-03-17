import java.util.Random;
import java.util.Scanner;
import Character.Player;
import Character.Enemy;
import Character.Monster;
import Character.Combatant;

public class Combat {

    Player player;
    Enemy enemy;

    public Combat(Player player){
        //receive player as an argument
        this.player = player;
        this.enemy = new Monster(this.player.getLevel());
    }

    public void executeCombat(){
        player.showStat();
        enemy.showStat();
        //while monster and user hp > 0
        while ((this.player.getHp() > 0) && (this.enemy.getHp() > 0)) {
            Scanner input = new Scanner(System.in);
            System.out.println("What would you like to do?");
            System.out.println("(A)ttack");
            System.out.println("(R)un away");
            String userInputAction = input.nextLine();

            // Player attacks first!
            if (userInputAction.equalsIgnoreCase("A")) {
                this.attack(this.player, this.enemy);
            } else {
                boolean runOrHit = getRandomBoolean();
                if (runOrHit){
                    break;
                }
            }
            //Now it's the monsters turn
            this.attack(this.enemy, this.player);
        }

        if (this.player.getHp() > 0){
            System.out.println("Good job! You defeated the monster!");
            this.player.setLevel(this.player.getLevel()+1);
            player.showStat();

        } else {
            System.out.println("Ops, you are DEAD");
            System.exit(0);
        }
    }

    private void attack(Combatant attacker, Combatant defender){
        Random rand = new Random();

        int attackRoll = rand.nextInt(6) + attacker.getAtk();
        int defendRoll = rand.nextInt(6) + defender.getDef();
        int dmg = attackRoll - defendRoll;

        if (dmg <= 0) {
            System.out.println("Oops, " + attacker.getName() + " missed!");
        } else {
            System.out.println(attacker.getName() + " hits for " + dmg + " damage!");
            defender.setHp(defender.getHp() - dmg);
            System.out.println(defender.getName() + "'s hp is: " + defender.getHp());
        }
    }

    public static boolean getRandomBoolean(){
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
