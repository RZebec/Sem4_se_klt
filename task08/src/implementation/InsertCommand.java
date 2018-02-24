package implementation;

/**
 * Class representing the database insert command.
 */
public class InsertCommand implements IDatabaseCommand {
    /**
     * The database.
     */
    private Database database;
    /**
     * The value to insert.
     */
    private String valueToInsert;
    /**
     * Constructor for the database insert command.
     * @param database The database.
     * @param valueToInsert The value to insert.
     */
    public InsertCommand(Database database, String valueToInsert) {
        this.database = database;
        this.valueToInsert = valueToInsert;
    }
    /**
     * Executes the command.
     */
    public void execute() {
        this.database.insert(this.valueToInsert);
    }
}
