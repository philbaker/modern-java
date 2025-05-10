import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.io.UncheckedIOException;

// You can use an unchecked exception if you don't want to propogate IOException
// but also want something more specific than RuntimeException to re-throw

// Note that in general checked exceptions should be used for predictable but 
// unpreventable errors that are reasonable to recover from

public class FileUncheckedIOException {
    void main() {
        try {
            Path pathToNotes = Path.of("notes.txt");

            String read = Files.readAllLines(pathToNotes).get(0);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
            // Exception java.io.UncheckedIOException: java.nio.file.NoSuchFileException: notes.txt
        }
    }
}
