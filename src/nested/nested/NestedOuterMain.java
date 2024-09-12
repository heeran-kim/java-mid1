package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // NestedOuter outer = new NestedOuter();
        // since nested is a static class, nestedOuter instance isn't needed to create nested
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
