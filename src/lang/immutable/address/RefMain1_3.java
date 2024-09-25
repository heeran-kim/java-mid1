package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        // no side effect if the same object is not shared
        // but no way to prevent the sharing of reference values
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        change(b, "Busan");
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    private static void change(Address address, String changeAddress) {
        address.setValue(changeAddress);
    }
}
