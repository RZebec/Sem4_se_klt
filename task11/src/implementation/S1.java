package implementation;

/**
 * Class representing the door state S1 ("Closed")
 */
public class S1 implements IDoorState {
    /**
     * Promotes the door to state S2.
     * @param door The door.
     */
    public void promote(Door door) {
        door.setState(new S2()) ;
    }

    @Override
    public String toString() {
        return "Closed";
    }
}
