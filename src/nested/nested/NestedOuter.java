package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            // can access to own instance value
            System.out.println(nestedInstanceValue);

            // cannot access to outInstanceValue
            // System.out.println(outInstanceValue);

            // can access to outClassVale even if it is private
            System.out.println(outClassValue);
        }
    }
}
