enum Technique {
    KAMEHAMEHA,
    INSTANT_TRANSMISSION,
    KAIOKEN,
    ULTRA_INSTINCT
}

public class SDefault {
    boolean shouldBeMainCharacter(String name) {
        switch (name) {
            case "Gohan":
                return true;
            default:
                return false;
        }
    }

    // If you have a C-style switch over an enum you need the default case
    // for exhaustiveness
    boolean didGokuStealItFromSomeoneElse(Technique technique) {
        switch (technique) {
            case KAMEHAMEHA:
                System.out.println("Master Roshi Taught it to him");
                return true;
            case INSTANT_TRANSMISSION:
                System.out.println("Space aliens");
                return true;
            case KAIOKEN:
                System.out.println("King Kai's name is in it!");
                return true;
            case ULTRA_INSTINCT:
                System.out.println("I'd say not");
                return false;
            default:
                throw new IllegalStateException("Unexpected: " + technique);
        }
    }

    void main() {
        System.out.println(
            shouldBeMainCharacter("Goku")
        );
        // false

        System.out.println(
            didGokuStealItFromSomeoneElse(Technique.INSTANT_TRANSMISSION)
        );
        // Space aliens
        // true
    }

}
