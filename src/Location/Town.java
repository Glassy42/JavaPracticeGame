package Location;

public class Town extends Location {

    public Town() {
        this.description = "You are in the town. There is a blacksmith and a merchant here, and a path that leads to the forest";
    }

    @Override
    public void showNavigation() {
        System.out.println("(F)orest");
        System.out.println("(E)xit");
    }

    @Override
    public void showVisual() {
        System.out.println("~         ~~          __\n" +
                "       _T      .,,.    ~--~ ^^\n" +
                " ^^   // \\                    ~\n" +
                "      ][O]    ^^      ,-~ ~\n" +
                "   /''-I_I         _II____\n" +
                "__/_  /   \\ ______/ ''   /'\\_,__\n" +
                "  | II--'''' \\,--:--..,_/,.-{ },\n" +
                "; '/__\\,.--';|   |[] .-.| O{ _ }\n" +
                ":' |  | []  -|   ''--:.;[,.'\\,/\n" +
                "'  |[]|,.--'' '',   ''-,.    |\n" +
                "  ..    ..-''    ;       ''. '\n");

    }
}
