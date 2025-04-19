public class ForVWhile {
    public static void main(String[] args) {
        double[] numbers = { 4.4, 1.1, 4.1, 4.7 };

        // One benefit of the for is that it keeps the initialiser and expression
        // in one place whereas the expression in a while loop could be far from
        // the initialiser
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }

        int index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index += 1;
        }
    }
}
