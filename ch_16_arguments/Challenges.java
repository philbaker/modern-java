public class Challenges {
    void printSquare(int size) {
        size = Math.abs(size);

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    void challengeOne() {
        printSquare(4);
        printSquare(3);
        printSquare(2);
        printSquare(1);
    }

    void challengeTwo() {
        printSquare(3);
        printSquare(-3);
        printSquare(-2);
        printSquare(2);
    }

    int f(int arg) {
        return arg;
    }

    String f(String arg) {
        return arg;
    }

    char f(char arg) {
        return arg;
    }

    String[] f(String[] arg) {
        return arg;
    }

    void challengeThree() {
        f(2);
        f("b");
        f('9');
        f(new String[] { "s" });
    }

    void i() {
        System.out.print("I");
    }

    void did(String what) {
        System.out.print("did " + what);
    }

    void space() {
        System.out.print(" ");
    }

    void challengeFour() {
        i();
        space();
        did("it!");
    }
}
