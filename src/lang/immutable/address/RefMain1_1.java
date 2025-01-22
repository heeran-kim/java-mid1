package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        // ref variables can share one object at the same time
        Address a = new Address("Seoul"); // a has a value of address referring Seoul
        Address b = a; // b has a same value of address with a
        System.out.println("a = " + a); // Seoul
        System.out.println("b = " + b); // Seoul

        b.setValue("Busan"); // set the value of the instance from Seoul to Busan
        System.out.println("Busan -> b");
        System.out.println("a = " + a); // Busan
        System.out.println("b = " + b); // Busan
    }
}
