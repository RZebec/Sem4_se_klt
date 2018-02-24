package implementation;

/**
 * Interface for the door state.
 */
public interface IDoorState {
    /**
     * Promotes the door to another state.
     * @param door The door.
     */
    void promote(Door door);
}
