package implementation;

/**
 * Class representing the database memento caretaker.
 */
public class DataBaseMementoCareTaker {
    /**
     * The Database Memento.
     */
    private DatabaseMemento memento;
    /**
     * Gets the Database memento.
     * @return The Database memento.
     */
    public DatabaseMemento getMemento() {
        return memento;
    }
    /**
     * Sets the Database memento.
     * @param memento The Database memento.
     */
    public void setMemento(DatabaseMemento memento) {
        this.memento = memento;
    }
}
