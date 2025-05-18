import java.util.ArrayList;

public class ArrayLSize {
    void main() {
        ArrayList<String> names = new ArrayList<>();

        System.out.println(names.size());
        // 0

        names.add("Vincent Bisset de Gramont");
        System.out.println(names.size());
        // 1

        names.add("Mr. Nobody");
        System.out.println(names.size());
        // 2
    }
}
