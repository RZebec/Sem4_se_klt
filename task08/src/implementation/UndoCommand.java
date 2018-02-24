package implementation;

/**
 * Class representing the database undo command.
 */
public class UndoCommand implements IDatabaseCommand {
    /**
     * The database.
     */
    private Database database;
    /**
     * The database memento.
     */
    private DatabaseMemento databaseMemento;
    /**
     * Constructor for the database undo command.
     * @param database The database.
     * @param databaseMemento The database memento.
     */
    public UndoCommand(Database database, DatabaseMemento databaseMemento) {
        this.database = database;
        this.databaseMemento = databaseMemento;
    }
    /**
     * Executes the command.
     */
    public void execute() {
        this.database.undo(this.databaseMemento);
    }
}
