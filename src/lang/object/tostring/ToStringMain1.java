package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString(); // hashCode

        // all those lines are same
        System.out.println("string = " + string);
        System.out.println("object = " + object);
        System.out.println("object = " + object.toString());
    }
}
