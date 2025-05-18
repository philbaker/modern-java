public class SwitchNull {
    void eat(String food) {
        switch (food) {
            case "dog food" -> {
                System.out.println("Crunch");
            }
            case "cat food" -> {
                System.out.println("Slorp");
            }
            case null, default -> {
                System.out.println("Other food");
            }
        }
    }

    void main() {
        // Without a null case:
        // eat(null);
        // |  Exception java.lang.NullPointerException: Cannot invoke "String.hashCode()" because "<local1>
// " is null

        // With null case:
        eat(null);
        // Other food
    }
}
