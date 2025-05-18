class Muppet {
    String name;

    void scream() {
        this.name = name.toUpperCase() + "!";
    }
}

class Challenges {
    boolean isUpperCase(String x) {
        return x == x.toUpperCase();
    }

    boolean isLowerCase(String x) {
        return x == x.toLowerCase();
    }

    void echo(String s) {
        String result;

        if (s.isBlank() || s.isEmpty()) {
            result = "You Didn't Say Anything";
            System.out.println(result);

            return;
        }

        result = "You Said: " + s.strip();
        System.out.println(result);
    }

    void challengeOne() {
        System.out.println(isUpperCase("ABC"));
        // true
        System.out.println(isUpperCase("abc"));
        // false
        System.out.println(isUpperCase("AbC"));
        // false
    }

    void challengeTwo() {
        System.out.println(isLowerCase("ABC"));
        // false
        System.out.println(isLowerCase("abc"));
        // true
        System.out.println(isLowerCase("AbC"));
        // false
    }

    void challengeThree() {
        var kermit = new Muppet();
        kermit.name = "kermit";

        System.out.println(kermit.name);
        // kermit

        kermit.scream();
        System.out.println(kermit.name);
        // KERMIT!
    }

    void challengeFour() {
        echo("Hello");
        // You Said: Hello

        echo("      Hello      ");
        // You Said: Hello

        echo("");
        // You Didn't Say Anything

        echo("            ");
        // You Didn't Say Anything
    }
}
