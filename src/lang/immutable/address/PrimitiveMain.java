package lang.immutable.address;

/*
- Primitive Type: never share a value within multiple variables
- Reference Type: share a value with reference within multiple variables
 */

public class PrimitiveMain {

    public static void main(String[] args) {
        // primitive type never shares its value
        int a = 10;
        int b = a; // copy the value of a and assign it to b, not sharing

        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10

        b = 20;
        System.out.println("20 -> b");
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 20
    }
}
