package implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing the door.
 */
public class Door {
    /**
     * The door state.
     */
    private IDoorState state;
    /**
     * The door listeners.
     */
    private List<IDoorListener> listeners;
    /**
     * Constructor for the door.
     */
    public Door() {
        this.listeners = new ArrayList<>();
    }
    /**
     * Adds a listener.
     * @param listener The listener.
     */
    public void addListener(IDoorListener listener) {
        this.listeners.add(listener);
    }
    /**
     * Removes a listener.
     * @param listener The listener.
     */
    public void removeListener(IDoorListener listener) {
        this.listeners.remove(listener);
    }
    /**
     * Promotes the door to a new state.
     */
    public void promote() {
        this.state.promote(this);
        this.notifyListenersForStateChange(this.state);
    }
    /**
     * Sets the door state.
     * @param state The door state.
     */
    public void setState(IDoorState state) {
        this.state = state;
        this.notifyListenersForStateChange(this.state);
    }
    /**
     * Notifies the listeners if the door state is changed.
     * @param newState The new door state.
     */
    private void notifyListenersForStateChange(IDoorState newState) {
        for(IDoorListener listener : listeners) {
            listener.changeState(newState);
        }
    }
}
