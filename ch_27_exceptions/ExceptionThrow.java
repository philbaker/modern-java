public class ExceptionThrow {
    void crashesOnFive(int x) {
        if (x == 5) {
            throw new RuntimeException();
        }
    }

    void main() {
        crashesOnFive(1);
        System.out.println("Made it to step 1");

        crashesOnFive(5);
        System.out.println("Made it to step 2");
    }
}

// ExceptionThrow test = new ExceptionThrow();
// test.main();
// Made it to step 1
// |  Exception java.lang.RuntimeException
// |        at ExceptionThrow.crashesOnFive (#6:4)
// |        at ExceptionThrow.main (#6:12)
// |        at (#8:1)
