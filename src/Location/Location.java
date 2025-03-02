package Location;

public abstract class Location {
    protected String description;

    public void showDescription() {
        System.out.println(this.description);
    }

    public abstract void showNavigation();
}
