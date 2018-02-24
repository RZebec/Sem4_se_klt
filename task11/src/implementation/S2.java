package implementation;

/**
 * Class representing the door state S2 ("Locked")
 */
public class S2 implements IDoorState {
    /**
     * Promotes the door to state S3.
     * @param door The door.
     */
    public void promote(Door door) {
        door.setState(new S3());
    }

    @Override
    public String toString() {
        return "Locked";
    }
}
