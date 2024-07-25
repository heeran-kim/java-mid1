package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("dog1", 2);
        Dog dog2 = new Dog("dog2", 5);

        System.out.println("explicitly toString");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("inside println");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("using object polymorphism");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);

        // if you want to get the address
        // but you already overriding toString method
        // then use below
        String hexString = Integer.toHexString(System.identityHashCode(car));
        System.out.println("hexString = " + hexString);
    }
}
