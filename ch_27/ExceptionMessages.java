public class ExceptionMessages {
    void crashesOnFive(int x) {
        if (x == 5) {
            throw new RuntimeException("5 is an evil number");
        }
    }

    void main() {
        crashesOnFive(1);
        System.out.println("Made it to step 1");

        crashesOnFive(5);
        System.out.println("Will not make it to step 2");
    }
}

// ExceptionMessages test = new ExceptionMessages();
// test.main();
// Made it to step 1
// |  Exception java.lang.RuntimeException: 5 is an evil number
// |        at ExceptionMessages.crashesOnFive (#12:4)
// |        at ExceptionMessages.main (#12:12)
// |        at (#14:1)
