package nested.inner;

public class InnerOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int InnerInstanceValue = 1;
        
        public void print() {
            // can access to own member
            System.out.println("InnerInstanceValue = " + InnerInstanceValue);
            // can access to outer instance member including private
            System.out.println("outInstanceValue = " + outInstanceValue);
            // can access to outer class member including private
            System.out.println("outClassValue = " + outClassValue);
        }
    }
}
