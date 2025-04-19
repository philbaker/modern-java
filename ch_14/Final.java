public class Final {
    public static void main(String[] args) {
        int i = 0;

        // The initializer of a for loop can also declare final variables
        // There's not much use for this though
        for (final String name = "Bob"; i < 5; i++) {
            System.out.println(name + ": " + i);
        }

        for (final char[] letters = { 'I', 'O', 'U' }; letters[0] != 'A';) {
            for (int j = 0; j < letters.length; j++) {
                letters[j] -= 1;
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }
}
