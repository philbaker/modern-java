public class I {
    public static void main(String[] args) {
        String word = "bird";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.println(letter);
        }

        char[] letters = { 'A', 'B', 'C' };
        int[] numbers = { 1, 2 };

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(letters[i]);
                System.out.println(numbers[j]);
            }
        }
    }
}
