public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 2 * 3 + 3 * 9 / 2 - 2;

        System.out.println(result);

        boolean areThingsSame = 3 * (4 - 1 + 3) * 4 == 5 * 3 + 1 * 3 * 9;

        System.out.println(areThingsSame);
    }
}
