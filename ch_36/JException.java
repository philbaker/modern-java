public class JException {
    // The most vanilla checked exception is Exception
    // Useful if you want a checked exception but do not know of a better one

    void main() throws Exception {
        throw new Exception("Crash!");
    }

    // main();
    // Exception java.lang.Exception: Crash!
}
