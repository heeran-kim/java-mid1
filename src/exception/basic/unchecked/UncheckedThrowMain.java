package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();

        service.callthrow();
        System.out.println("normal exit");
    }
}
