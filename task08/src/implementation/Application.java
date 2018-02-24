package implementation;

public class Application {
    public static void main(String[] args) {
        DataBaseMementoCareTaker dataBaseMementoCareTaker = new DataBaseMementoCareTaker();
        Database database = new Database();

        IDatabaseCommand command = new InsertCommand(database, "Penguin");
        command.execute();
        command = new InsertCommand(database, "Dog");
        command.execute();
        dataBaseMementoCareTaker.setMemento(database.save());
        command = new InsertCommand(database, "Cat");
        command.execute();
        database.printDataBase();
        command = new UndoCommand(database, dataBaseMementoCareTaker.getMemento());
        command.execute();
        database.printDataBase();
    }
}