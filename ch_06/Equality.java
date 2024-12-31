public class Equality {
    public static void main(String[] args) {
        boolean universeBroken = 1 == 2;
        System.out.println(universeBroken);

        int loneliestNumber = 1;
        int canBeAsBadAsOne = 2;

        boolean bothLonely =  loneliestNumber == (canBeAsBadAsOne - 1);
        System.out.println(bothLonely);

        boolean universeOkay = 1 != 2;
        System.out.println(universeOkay);
    }
}
