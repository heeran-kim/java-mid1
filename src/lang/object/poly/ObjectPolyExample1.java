package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // object is a parent class
        // can't call child's method
        // because there is no overriding method
        // hence, there is a limit to use object class for polymorphism
        // obj.move();
        // obj.sound();

        // need to do downcasting
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
