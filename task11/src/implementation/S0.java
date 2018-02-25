package implementation;

/**
 * Class representing the door state S0 ("Opened")
 */
public class S0 implements IDoorState {
    /**
     * Promotes the door to state S1.
     * @param door The door.
     */
    public void promote(Door door) {
        door.setState(new S1());
    }

    @Override
    public String toString() {
        return "Opened";
    }
}
