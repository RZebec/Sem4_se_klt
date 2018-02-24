package implementation;

/**
 * Class representing the door state S3 ("Unlocked")
 */
public class S3 implements IDoorState {
    /**
     * Promotes the door to state S0.
     * @param door The door.
     */
    public void promote(Door door) {
        door.setState(new S0());
    }

    @Override
    public String toString() {
        return "Unlocked";
    }
}
