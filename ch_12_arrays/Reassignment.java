public class Reassignment {
    public static void main(String[] args) {
        int[] numbers = { 1, 2 };

        System.out.println(numbers.length);
        // 2

        numbers = new int[] { numbers[0], numbers[1], 3 };

        System.out.println(numbers.length);
        // 3

        char[] wordOne = { 'g', 'o' };
        char[] wordTwo = wordOne;

        System.out.println(wordOne);
        System.out.println(wordTwo);
        // go

        wordOne = new char[] { wordOne[0], wordOne[1], 's', 'h' };

        System.out.println(wordOne);
        // gosh
        System.out.println(wordTwo);
        // go

        wordOne[0] = 'p';

        System.out.println(wordOne);
        // posh
        System.out.println(wordTwo);
        // go
    }
}
