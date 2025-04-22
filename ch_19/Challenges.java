public class Challenges {
    // int compute(int x) {
    //     if (x == 0) {
    //         return null;
    //     }
    //     else {
    //         return x * x;
    //     }
    // }

    void challengeOne() {
        // System.out.println(compute(5));
        // Error because compute can return null
    }

    void printDistances(Integer[] distances) {
        if (distances == null) {
            distances = new Integer[] {};
        }

        for (int i = 0; i < distances.length; i++) {
            System.out.println(distances[i] + " kilometers");
        }
    }

    void challengeTwo() {
        printDistances(new Integer[] { 1, 2 , 3 });
        printDistances(null);
    }

    Integer onlyPositive(int x) {
        if (x > 0) {
            return x;
        }
        else {
            return null;
        }
    }

    void challengeThree() {
        System.out.println(
            onlyPositive(45)
        );
        // 45

        System.out.println(
            onlyPositive(45 + 1)
        );
        // 46

        System.out.println(
            onlyPositive(0)
        );
        // null

        System.out.println(
            onlyPositive(-1)
        );
        // null
    }

    void challengeFour() {
        int ducks = 5;
        Integer sparrows = 3;

        int birds = ducks + sparrows;
        System.out.println(birds);
        // 8

        // char[] face = new char[] { ':', ')' };
        // Character[] smile = face;

        // System.out.println(smile);
        // This won't work due to assigning a Character[] to a char[]
    }

    void challengeFive() {
        char[] face = new char[] { ':', ')' };

        Character[] smile = new Character[face.length];
        for (int i = 0; i < face.length; i++) {
            smile[i] = face[i];
        }

        System.out.println(smile);
        // [Ljava.lang.Character;@1990a65e
    }
}
