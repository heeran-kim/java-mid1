package exception.basic.checked;

public class Service {

    Client client = new Client();

    /**
     * processing exception
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {

        // client.call() makes MyCheckedException only
        // so it can't be caught and need to be thrown away.
        // } catch (RuntimeException e) {

        // Exception is parents of MyCheckedException
        // so if you try to catch MyCheckedException by catching Exception
        // it will work.
        // } catch (Exception e) {

            // processing exception logic
            System.out.println("Service.callCatch");
            System.out.println("processing an exception, message=" + e.getMessage());
            System.out.println();
        }
        // processing done
        System.out.println("Service.callCatch");
        System.out.println("main stream");
        System.out.println();
    }

    /**
     * throw checked exception that can't be handled here
     * to outer
     */
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
