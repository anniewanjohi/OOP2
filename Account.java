// Account.java
public abstract class Account {

    private int id;
    private String name;
    private OperationStrategy operation;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void performOperation(OperationStrategy operation) {
        this.operation = operation;
        operation.execute();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
