public class IntegerFromString {
    void main() {
        String text = "123";

        int oneTwoThree = Integer.parseInt(text);
        // 123

        String word = "music";
        // int value = Integer.parseInt(word);
        // Error

        int value;
        try {
            value = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            value = 0;
        }

        System.out.println(value);
        // 0
    }
}
