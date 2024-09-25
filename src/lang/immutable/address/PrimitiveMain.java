package lang.immutable.address;

/*
- Primitive Type: never share a value within multiple variables
- Reference Type: share a value with reference within multiple variables
 */

public class PrimitiveMain {

    public static void main(String[] args) {
        int a = 10;
        int b = a; // copy the value of a and assign it to b

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
