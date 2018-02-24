package implementation;

import java.util.List;

/**
 * Class representing the database memento.
 */
public class DatabaseMemento {
    /**
     * The values in the database, represented by a list of strings.
     */
    private List<String> databaseValues;
    /**
     * Constructor for the database memento.
     * @param databaseValues The values in the database.
     */
    public DatabaseMemento(List<String> databaseValues) {
        this.databaseValues = databaseValues;
    }
    /**
     * Gets the values in the database.
     * @return The values in the database.
     */
    public List<String> getDatabaseValues() {
        return databaseValues;
    }
}
