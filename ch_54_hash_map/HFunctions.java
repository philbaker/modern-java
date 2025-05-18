// A hash function is something that takes a piece of data and extracts a smaller,
// but predictable, piece of data from it

record CarsCharacter(
    String firstName,
    String lastName
) {}

char hashFunction(
    String lastName
) {
    return lastName.charAt(0);
}

public class HFunctions {
    void main() {
        var lightning = new CarsCharacter("Lightning", "McQueen");

        char firstOfLast = hashFunction(lightning.lastName());
        System.out.println(firstOfLast);
        // M
    }
}
