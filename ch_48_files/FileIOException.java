import java.io.IOException;

// If some code is "doing IO" you should expect it to throw an IOException

public class FileIOException {
    void main() throws IOException {
        throw new IOException("Something went wrong");
        // Error:
        // Exception java.io.IOException: Something went wrong
    }
}
