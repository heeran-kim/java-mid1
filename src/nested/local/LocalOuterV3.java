package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public Printer process(int paramVar) {
        // local variable will be deleted when the stack frame ends
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // Instance lives longer than local variables (until GC)
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print();
        // don't execute any method in the instance, just return it
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);
        // execute it here after deleting stack frame of process()
        printer.print();
        // even local class exists in heap region with outer class address
        // so that it survives until GC. even if stack frame is deleted already
        // local variables such as paramVar, localVar would be deleted.
        // then how to print these even after stack frame is deleted?
        //
    }
}
