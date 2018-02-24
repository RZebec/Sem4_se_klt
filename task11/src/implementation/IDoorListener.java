package implementation;

/**
 * Interface for the door listener.
 */
public interface IDoorListener {
    /**
     * Changes the display door state for the listener.
     * @param newState The new door state.
     */
    void changeState(IDoorState newState);
}
