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

    //interface could be good for this
    public void showVisual(){
        System.out.println("            _.------.                        .----.__\n" +
                "           /         \\_.       ._           /---.__  \\\n" +
                "          |  O    O   |\\\\___  //|          /       `\\ |\n" +
                "          |  .vvvvv.  | )   `(/ |         | o     o  \\|\n" +
                "          /  |     |  |/      \\ |  /|   ./| .vvvvv.  |\\\n" +
                "         /   `^^^^^'  / _   _  `|_ ||  / /| |     |  | \\\n" +
                "       ./  /|         | O)  O   ) \\|| //' | `^vvvv'  |/\\\\\n" +
                "      /   / |         \\        /  | | ~   \\          |  \\\\\n" +
                "      \\  /  |        / \\ Y   /'   | \\     |          |   ~\n" +
                "       `'   |  _     |  `._/' |   |  \\     7        /\n" +
                "         _.-'-' `-'-'|  |`-._/   /    \\ _ /    .    |\n" +
                "    __.-'            \\  \\   .   / \\_.  \\ -|_/\\/ `--.|_\n" +
                " --'                  \\  \\ |   /    |  |              `-\n" +
                "                       \\uU \\UU/     |  /       \n");
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
                } else {
                    System.out.println("Ops, there is no way out.. face the monster!");
                }
            }
            //Now it's the monsters turn
            if (this.enemy.getHp() > 0) {
                this.attack(this.enemy, this.player);
            }
        }

        if (this.player.getHp() > 0 && this.enemy.getHp() <= 0){
            System.out.println("Good job! You defeated the monster!");
            this.player.setLevel(this.player.getLevel()+1); //or get xp

        } else if (this.player.getHp() <= 0) {
            System.out.println("Ops, you are DEAD");
            System.exit(0);
        } else {
            System.out.println("Nothing is worth more than life, let's run away from the monster");
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
