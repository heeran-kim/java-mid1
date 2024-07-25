package lang.object.tostring;

public class ObjectPrinter {

    public static void print(Object obj) {
        String string = "Print object information: " + obj.toString();
        System.out.println(string);
    }
}
