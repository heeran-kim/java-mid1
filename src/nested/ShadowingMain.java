package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner {
        public int value = 2;

        void go() {
            int value = 3;
            // local is prioritised, instance member value is shadowed
            System.out.println("value = " + value);
            // 'this' is used for accessing instance things
            System.out.println("this.value = " + this.value);
            // 'OuterClass Name.this' is used for accessing outer class's instance things
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
