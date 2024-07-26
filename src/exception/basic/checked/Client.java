package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {

        // throws: hand over an exception somewhere

        // throw: create issue
        throw new MyCheckedException("ex");
    }
}
