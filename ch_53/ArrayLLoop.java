import java.util.ArrayList;

public class ArrayLLoop {
    void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sofia Al-Azwar");
        names.add("Viggo Tarasov");
        names.add("Iosef Tarasov");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            System.out.println("NAME: " + name);
        }
        // NAME: Sofia Al-Azwar
        // NAME: Viggo Tarasov
        // NAME: Iosef Tarasov
    }
}
