public class Challenges {
    void printNames(String[] names) {
        if (names == null || names.length == 0) {
            System.out.println("No names provided");

            return;
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    void challengeOne() {
        printNames(new String[] {
            "Joker",
            "Batman",
            "Alfred",
        });
    }

    void challengeTwo() {
        printNames(null);
    }

    void challengeThree() {
        String[] jobs = new String[] {
            "Carpenter",
            "Baker",
            null,
            "Astronomer",
        };

        // This works because String can be null
        for (int i = 0; i < jobs.length; i++) {
            System.out.println(jobs[i]);
        }
    }

    void challengeFour() {
        // Not valid because an int cannot be null

        // int[] numbers = new int[] {
        //     45,
        //     32,
        //     null,
        //     94
        // }
        //
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.println(numbers[i]);
        // }
    }

    String bigness(String letters) {
        if (letters == null) {
            return "No letters provided";
        }

        int bigness = 0;

        for (int i = 0; i < letters.length(); i++) {
            bigness++;
        }

        if (bigness < 5) {
            return "small";
        }
        else if (bigness < 10) {
            return "medium";
        }
        else {
            return "big";
        }
    }

    void challengeFive() {
        System.out.println(
            bigness("bore")
        );

        System.out.println(
            bigness("boiler")
        );

        System.out.println(
            bigness("filter")
        );

        System.out.println(
            bigness("knower")
        );

        System.out.println(
            bigness("chrysanthemum")
        );

        System.out.println(
            bigness(null)
        );
    }
}
