public class CheckedExceptions {
    int divide(int x, int y) {
        if (y == 0) {
            // Will not work because nothing handles the exception
            // throw new Exception();
        }

        return x / y;
    }
}
