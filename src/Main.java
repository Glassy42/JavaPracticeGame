import Location.Location;
import Location.Forest;
import Location.Town;
import Character.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");
        Player player = new Player();

        Map<String, Location> locationList = new HashMap<>(); //hashmap instead of arraylist because easy to track of locations
        locationList.put("t", new Town());
        locationList.put("f", new Forest());

        Location currentLocation = locationList.get("t");

        while (true) {
            currentLocation.showDescription();
            Scanner input = new Scanner(System.in);
            currentLocation.showNavigation();

            String userInputLocation = input.nextLine();

            if (userInputLocation.equalsIgnoreCase("f")) {
                currentLocation = locationList.get(userInputLocation);
                System.out.println("Let's go to the forest");
            }else if (userInputLocation.equalsIgnoreCase("c")) {
                System.out.println("You are in combat mode!");
                Combat combat = new Combat(player);
                combat.executeCombat();

            }else if (userInputLocation.equalsIgnoreCase("t")){
                currentLocation = locationList.get(userInputLocation);
                System.out.println("Let's go to the town");

            }else if (userInputLocation.equalsIgnoreCase("e")){
                System.out.print("Bye, we hope to see you again!");
                break;
            }else {
                System.out.println("Please enter valid value");

            }

        }
    }
}