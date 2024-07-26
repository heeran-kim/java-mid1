package exception.basic.unchecked;

/**
 * don't need to throw them explicitly
 */
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
