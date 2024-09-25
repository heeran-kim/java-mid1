package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // no side effect if the same object is not shared
        // but no way to prevent the sharing of reference values
        Address a = new Address("Seoul");
        Address b = new Address("Seoul");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan");
        System.out.println("Busan -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
