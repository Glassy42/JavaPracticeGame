package Location;

public class Town extends Location {

    public Town() {
        this.description = "You are in the town. There is a blacksmith and a merchant here, and a path that leads to the forest";
    }

    public void showNavigation() {
        System.out.println("(F)orest");
        System.out.println("(E)xit");
    }
}
