package exception.basic.checked;

/**
 * An exception who inherits Exception turns into a Checked Exception
 * (Except for Runtime Error)
 * Checked exception needs to be caught or thrown
 * otherwise it causes a compile error
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
        // to keep the error message
        // getMessage(): get this error message from `Throwable` class
    }
}
