package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // InnerOuter.Inner inner = new Inner();

        // An instance of outer class is needed to create an inner class instance.
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();
        System.out.println("inner.getClass() = " + inner.getClass());
    }
}
