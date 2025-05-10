import java.nio.file.Path;

public class FilePaths {
    void main() {
        Path pathToNotes = Path.of("notes.txt");

        System.out.println(pathToNotes);
        // "notes.txt"
    }
}
