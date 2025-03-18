package Location;

public class Forest extends Location {
    public Forest() {
        this.description = "You are in the forest. There is nothing, but tress around you and a small path that leads back to town";
    }

    @Override
    public void showNavigation() {
        System.out.println("(T)own");
        System.out.println("(C)ombat");
        System.out.println("(E)xit");
    }
    @Override
    public void showVisual(){
        System.out.println("       ^  ^  ^   ^      ___I_      ^  ^   ^  ^  ^   ^  ^\n" +
                "      /|\\/|\\/|\\ /|\\    /\\-_--\\    /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\\n" +
                "      /|\\/|\\/|\\ /|\\   /  \\_-__\\   /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\\n" +
                "      /|\\/|\\/|\\ /|\\   |[]| [] |   /|\\/|\\ /|\\/|\\/|\\ /|\\/|\\");
    }

}

