public class SwitchExhaustiveness {
    void main() {
        // When a switch is used as an expression it needs to be exhaustive

        String name = "bob";

        boolean cool = switch (name) {
            case "bob" -> false;
            default -> true;
        }

        System.out.println(cool);
        // false

        // If you attempt to make a non-exhaustive switch expression, Java will
        // not let you
        String name2 = "bob";

        // boolean cool2 = switch (name2) {
        //     case "bob" -> false;
        // };
        // Error: the switch expression does not cover all possible input values
        // System.out.println(cool2);
    }
}
