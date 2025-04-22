public class NullUnknown {
    String askForName() {
        return "Viola";
    }

    void main() {
        String firstName = null;

        // Between when you don't know the information and when you learn it
        // you can use a variable initialised to null

        firstName = askForName();
    }
}
