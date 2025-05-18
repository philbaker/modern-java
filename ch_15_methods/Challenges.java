public class Challenges {
    void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void challengeOne() {
        printSquare(4);
    }

    String doubleString(String x) {
        return x + x;
    }

    String upcase(String x) {
        return x.toUpperCase();
    }

    String questionize(String x) {
        return x + "?";
    }

    String exclamize(String x) {
        return x + "!";
    }

    void challengeTwo() {
        System.out.println(
            questionize(exclamize(upcase(doubleString("java"))))
        );
    }
}
