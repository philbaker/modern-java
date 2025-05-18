public class JThrows {
    int divide(int x, int y) throws Exception {
        if (y == 0) {
            throw new Exception();
        }

        return x / y;
    }

    void doStuff() {
        // divide(1, 0);
        // Error
    }

    // You can also declare unchecked exceptions using `throws` but you are
    // never required to
    int divide2(int x, int y) throws RuntimeException {
        if (y == 0) {
            throw new RuntimeException();
        }

        return x / y;
    }
}
