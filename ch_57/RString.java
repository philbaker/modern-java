import java.lang.Character;

public class RString {
    void printEachUpperCase(String s, int i) {
        if (i < s.length()) {
            System.out.println(Character.toUpperCase(s.charAt(i)));
            printEachUpperCase(s, i + 1);
        }
    }

    void printEachUpperCase(String s) {
        printEachUpperCase(s, 0);
    }

    void main() {
        printEachUpperCase("hello");
        // H
        // E
        // L
        // L
        // O
    }
}
