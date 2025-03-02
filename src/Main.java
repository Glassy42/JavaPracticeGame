import Location.Location;
import Location.Forest;
import Location.Town;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the game!");

        Map<String, Location> locationList = new HashMap<>(); //hashmap instead of arraylist coz easy to track of locations
        locationList.put("t", new Town());
        locationList.put("f", new Forest());

        Location currentLocation = locationList.get("t");

        while (true) {
            currentLocation.showDescription();
            Scanner input = new Scanner(System.in);
            System.out.println("Would you like to go somewhere else?");
            currentLocation.showNavigation();

            String userInputLocation = input.nextLine();

            if (userInputLocation.equalsIgnoreCase("f")) {
                currentLocation = locationList.get(userInputLocation);
                System.out.println("Let's go to the forest");
            }else if (userInputLocation.equalsIgnoreCase("t")){
                currentLocation = locationList.get(userInputLocation);
                System.out.println("Let's go to the town");

            }else if (userInputLocation.equalsIgnoreCase("e")){
                System.out.print("Bye, we hope to see you again!");
                break;
            } else {
                System.out.println("Please enter valid value");

            }

        }
    }
}