package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        // all objects of the world can be contained in this array
        Object[] objects = {dog, car, object};

        size(objects);
    }

    // This method is for all objects in the world anywhere anytime
    // All developers would make it by themselves
    // if there is no one thing that Java provides
    private static void size(Object[] objects) {
        System.out.println("The number of objects: " + objects.length);
    }
}
