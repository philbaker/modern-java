import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {
    void main() throws IOException {
        Path folderPath = Path.of("example1");
        // This will fail if the directory already exists
        Files.createDirectory(folderPath);
    }
}
