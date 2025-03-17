package Character;

import java.util.Scanner;

public class Player extends Combatant {
    int xp = 0;

    public Player(){
        this.atk = 1;
        this.def = 1;
        this.hp = 10;
        this.level = 1;
        this.name = "Character.Player";

        Scanner input = new Scanner(System.in);

        System.out.println("What types of race would you like to play?");
        System.out.println("(E)lf");
        System.out.println("(D)warf");
        System.out.println("(H)uman");

        String userInputRace = input.nextLine();

        if (userInputRace.equalsIgnoreCase("E")){
            System.out.println("You chose Elf, you have high attack level!");
            this.atk += 2;
        } else if (userInputRace.equalsIgnoreCase("D")) {
            System.out.println("You chose Dwarf, you have high defence level!");
            this.def += 2;
        } else {
            System.out.println("You chose Human, you have high defence level!");
            this.hp += 20;
        }

    }

}
