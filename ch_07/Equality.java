public class Equality {
    public static void main(String[] args) {
        double numberOfToes = 10.0;
        double numberOfFingers = 10.0;

        boolean humanGenerated = numberOfToes == numberOfFingers;

        System.out.println(humanGenerated);

        double x = 0.1;
        double y = 0.2;
        double z = x + y;

        boolean doesWhatYouExpect = z == 0.3;

        System.out.println(doesWhatYouExpect);
        System.out.println(z);

        int x2 = 5;
        double y2 = 5.0;
        boolean fiveIsFive = x2 == y2; // true

        System.out.println(fiveIsFive);
    }
}
