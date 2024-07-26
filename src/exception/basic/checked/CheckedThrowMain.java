package exception.basic.checked;

public class CheckedThrowMain {

    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();

        service.catchThrow();
        // main throws as well
        // prints `stack trace` to the console and error exit
        System.out.println("Normal Exit");
    }
}
