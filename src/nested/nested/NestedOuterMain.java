package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        // NestedOuter outer = new NestedOuter();

        // since Nested is a static class, NestedOuter instance isn't needed to create Nested
        // The only different thing is that nested class can access to private things in outer class
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested.getClass() = " + nested.getClass());
    }
}
