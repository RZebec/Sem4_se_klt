package implementation;

/**
 * Class representing the Display.
 */
public class Display implements IDoorListener {
    /**
     * The door state.
     */
    private IDoorState doorState;
    /**
     * Changes the display door state.
     * @param newState The new door state.
     */
    public void changeState(IDoorState newState) {
        this.doorState = newState;
    }
    /**
     * Prints the door state.
     */
    public void printDoorState() {
        System.out.println("Door state reported from the display: " + this.doorState.toString());
    }
}
