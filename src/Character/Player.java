package Character;

import java.util.Scanner;

public class Player extends Combatant {
    int xp = 0;

    public Player() {
        this.atk = 1;
        this.def = 1;
        this.hp = 10;
        this.level = 1;

        Scanner input = new Scanner(System.in);

        String userInputRace;
        while (true) {
            System.out.println("What types of race would you like to play?");
            System.out.println("(E)lf");
            System.out.println("(D)warf");
            System.out.println("(H)uman");

            userInputRace = input.nextLine();

            //check if the input is valid
            if (userInputRace.equalsIgnoreCase("E")) {
                System.out.println("You chose Elf, you have high attack level!");
                this.atk += 2;
                break;
            } else if (userInputRace.equalsIgnoreCase("D")) {
                System.out.println("You chose Dwarf, you have high defence level!");
                this.def += 2;
                break;
            } else if (userInputRace.equalsIgnoreCase("H")) {
                System.out.println("You chose Human, you have high hp!");
                this.hp += 4;
                break;
            } else {
                System.out.println("Please type the right value");
            }
        }
        System.out.println("What's your character's name?");

        this.name = input.nextLine();

    }
}
