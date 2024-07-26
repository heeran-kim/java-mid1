package exception.basic.unchecked;

public class Service {

    Client client = new Client();

    public void callCatch() {
        try {
            client.call();
        } catch (MyUncheckedException e) {
            System.out.println("processing error ... " + e.getMessage());
        }
        System.out.println("normal path");
    }

    public void callthrow() {
        client.call();
    }
}
