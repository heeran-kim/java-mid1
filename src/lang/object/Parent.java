package lang.object;

// if there is no parent then object class is always be the parent
// Object has some methods that any object need to have
// for example,
// `toString` for offering information of an object
// `equals` for returning if they are same objects
// `getClass` for offering information of class of object
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
