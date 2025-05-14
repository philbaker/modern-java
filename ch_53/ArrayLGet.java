import java.util.ArrayList;

public class ArrayLGet {
    void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Winston Scott");

        String name = names.get(0);
        System.out.println(name);
        // Winston Scott

        // String name2 = names.get(10);
        // Exception java.lang.IndexOutOfBoundsException: Index 10 out of bounds for length 1
    }
}
