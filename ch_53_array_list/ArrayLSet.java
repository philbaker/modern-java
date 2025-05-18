import java.util.ArrayList;

public class ArrayLSet {
    void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("John Wick");

        names.set(0, "Baba Yaga");

        System.out.println(names);
        System.out.println(names.get(0));
        // Baba Yaga

        // names.set(15, "Riccordo Doe");
        // Exception java.lang.IndexOutOfBoundsException: Index 15 out of bounds for length 1
    }
}
