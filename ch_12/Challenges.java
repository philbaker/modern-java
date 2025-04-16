public class Challenges {
    public static void challengeOne() {
        String[] array = {};
        String[] words = { "Sam", "I", "Am" };
        System.out.println(array.length);
    }

    public static void challengeTwo() {
        char[] letters = {
            ' ',
            'h',
            'e',
            'l',
            'o',
            'w',
            'r',
            'd'
        };

        System.out.println(
            " "
            + letters[1]
            + letters[2]
            + letters[3]
            + letters[3]
            + letters[4]
            + letters[0]
            + letters[5]
            + letters[4]
            + letters[6]
            + letters[3]
            + letters[7]
        );
    }

    public static void challengeThree() {
        final int[] numbers = { 1, 2, 3, 4 };

        numbers[0] = 0;
        numbers[1] = 0;
        numbers[2] = 0;
        numbers[3] = 0;

        int total = 0;
        int index = 0;
        while (index < numbers.length) {
            total += numbers[index];
            index += 1;
        }
        System.out.println(total);
    }

    public static void challengeFour() {
        char[] name = { 'b', 'u', 'l', 'b' };

        name = new char[] { 'b', 'u', 'l', 'b', 'a', 's', 'a', 'u', 'r' };

        char[] toPrint = name;
        System.out.println(toPrint);
    }
}
