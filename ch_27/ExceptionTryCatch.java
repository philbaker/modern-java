public class ExceptionTryCatch {
    void doThing(int x) {
        if (x == 0) {
            throw new RuntimeException("Cannot do something zero times");
        }
    }

    void main() {
        int x = 0;
        try {
            doThing(x);
        } catch (RuntimeException e) {
            System.out.println("Something went wrong doing a thing");
        }
    }
}

ExceptionTryCatch test = new ExceptionTryCatch();
test.main();
// Something went wrong doing a thing
