public class CheckEmpty {
    void main() {
        String textMessages = "";
        System.out.println(
            textMessages.length() == 0
        );
        // true

        System.out.println(
            textMessages.isEmpty()
        );
        // true
    }
}
