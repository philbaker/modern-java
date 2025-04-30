public class UncheckedExceptions {
    int divide(int x, int y) {
        if (y == 0) {
            // Will work because you are not forced to handle an unchecked exception
            throw new RuntimeException();
        }

        return x / y;
    }
}
