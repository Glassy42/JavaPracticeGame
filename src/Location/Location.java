package Location;

public abstract class Location {
    protected String description;

    public void showDescription() {
        System.out.println(this.description);
    }

    public abstract void showNavigation(); //abstract: this function does not have body -> forcing subclass to implement this function

    public abstract void showVisual();
}
