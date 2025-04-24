public class Challenges {
    void challengeOne() {
        class Gonzo {}
        class FozzieTheBear {}
        class MsPiggy {}

        System.out.println(new Gonzo());
        // Main$Gonzo@3439f68d
        System.out.println(new FozzieTheBear());
        // Main$FozzieTheBear@71d15f18
        System.out.println(new MsPiggy());
        // Main$MsPiggy@6c9f5c0d
    }

    void challengeTwo() {
        class Movie {
            String title;
        }

        Movie movie = new Movie();
        movie.title = "Muppets in Space";

        System.out.println(movie.title);
        // Muppets in Space
    }

    void challengeThree() {
        class ThemePark {
            double entranceFee = 35.24;
        }

        ThemePark themePark = new ThemePark();

        System.out.println(themePark.entranceFee);
        // 35.24
    }

    void challengeFour() {
        class Kermit {
            boolean angry = true;
        }

        var kermit = new Kermit();

        System.out.println(kermit.angry);
    }

    class SquareRoot {
        double positiveRoot;
        double negativeRoot;
    }

    SquareRoot squareRoot(double value) {
        SquareRoot sqrt = new SquareRoot();

        sqrt.positiveRoot = Math.sqrt(value);
        sqrt.negativeRoot = -sqrt.positiveRoot;

        return sqrt;
    }

    void challengeFive() {
        SquareRoot sqrtOfFour = squareRoot(4);
        System.out.println(sqrtOfFour.positiveRoot);
        // 2.0
        System.out.println(sqrtOfFour.negativeRoot);
        // -2.0

        SquareRoot sqrtOfFifteen = squareRoot(15);
        System.out.println(sqrtOfFifteen.positiveRoot);
        // 3.872983346207417
        System.out.println(sqrtOfFifteen.negativeRoot);
        // -3.872983346207417
    }

    void challengeSix() {
    }
}
