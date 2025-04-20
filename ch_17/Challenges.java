public class Challenges {
    int stringToInt (String x) {
        try {
           return Integer.valueOf(x);
        }
        catch(Exception e) {
            System.out.println("Error converting string to number. Returning 0: " + e);

            return 0;
        }
    }

    void challengeOne() {
        System.out.println(stringToInt("55"));
        System.out.println(stringToInt("Voila"));
    }

    String h (int x) {
        return "h-" + x;
    }

    String g (String x, String y) {
        return "g" + x + y;
    }

    String f (String x, String y, String z) {
        return "f" + x + y + z;
    }

    void challengeTwo() {
        f(g(h(4), "b"), "e", "s");
    }

    boolean negateTotal(int x, int y) {
        if (x > 0 && y > 0) {
            return false;
        }

        if (x < 0 && y < 0) {
            return false;
        }

        return true;
    }

    int multiply(int x, int y) {
        int total = 0;
        int x2 = Math.abs(x);
        int y2 = Math.abs(y);

        for (int i = 0; i < y2; i++) {
            total += x2;
        }

        return negateTotal(x, y) ? -total : total;
    }

    void challengeThree() {
        System.out.println(multiply(-5, 5));
        System.out.println(multiply(-5, -2));
        System.out.println(multiply(9, -2));
    }

    int substractInt(double x, double y) {
        double total = x - y;

        return (int) total; 
    }

    double add(double x, double y) {
        return x + y;
    }

    double multiply(double x, double y) {
        return x * y;
    }

    void challengeFour() {
        int x = 5;
        int y = 8;
        int z = substractInt(add(4, 5), multiply(4, 2));

        System.out.println(z);
    }
}
