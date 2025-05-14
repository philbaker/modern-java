enum Technique {
    KAMEHAMEHA,
    INSTANT_TRANSMISSION,
    KAIOKEN,
    ULTRA_INSTINCT
}

public class SYield {
    // If every branch of a C-style switch yields a value, you can use that switch
    // as an expression
    // In this situation you do not need to have a default case for switches
    // over enums
    boolean didGokuStealItFromSomeoneElse(Technique technique) {
        boolean answer = switch (technique) {
            case KAMEHAMEHA:
            case INSTANT_TRANSMISSION:
            case KAIOKEN:
                yield true;
            case ULTRA_INSTINCT:
                yield false;
        };

        return answer;
    }

    void main() {
        System.out.println(
            didGokuStealItFromSomeoneElse(Technique.INSTANT_TRANSMISSION)
            // true
        );
    }
}
