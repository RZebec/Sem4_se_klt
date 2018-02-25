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
        this.printDoorState();
    }
    /**
     * Prints the door state.
     */
    private void printDoorState() {
        System.out.println("Door state reported from the display: " + this.doorState.toString());
    }
}
