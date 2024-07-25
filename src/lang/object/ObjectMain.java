package lang.object;

public class ObjectMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // object class has a method named toString
        // toString returns information of object
        String string = child.toString();
        System.out.println(string);
    }
}
