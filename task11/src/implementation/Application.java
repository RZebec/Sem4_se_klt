package implementation;

public class Application {
    public static void main(String[] args) {
        Door door = new Door();

        Display display = new Display();
        door.addListener(display);

        door.setState(new S0());

        door.pressButton();

        door.pressButton();

        door.pressButton();

        door.pressButton();

        door.pressButton();

        door.pressButton();
    }
}