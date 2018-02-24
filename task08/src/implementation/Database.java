package implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Representing the Database.
 */
public class Database {
    /**
     * The values in the database, represented by a list of strings.
     */
    private List<String> databaseValues;
    /**
     * Constructor for the database.
     */
    public Database() {
        this.databaseValues = new ArrayList<>();
    }
    /**
     * Inserts a value in the database.
     * @param value The value to insert.
     */
    public void insert(String value) {
        this.databaseValues.add(value);
    }
    /**
     * Saves the current state of the database as a memento.
     * @return The Database memento.
     */
    public DatabaseMemento save(){
        List<String> values = new ArrayList<>();
        for(String rowValue : this.databaseValues)
            values.add(rowValue);
        return new DatabaseMemento(values);
    }
    /**
     * Undo the changes made to the database.
     * @param databaseMemento The Database memento.
     */
    public void undo(DatabaseMemento databaseMemento) {
        this.databaseValues = databaseMemento.getDatabaseValues();
    }
    /**
     * Prints the content of the database.
     */
    public void printDataBase() {
        for(String row : this.databaseValues) {
            System.out.println(row);
        }
        System.out.println("----------------------");
    }
}
