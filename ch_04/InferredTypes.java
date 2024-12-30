public class InferredTypes {
    public static void main(String[] args) {
        var theDude = "Lebowski";
        System.out.println(theDude);

        // Not allowed - Java cannot infer the type
        // var theDude2;
        // theDude2 = "Lebowski";
        // System.out.println(theDude2);

        final var theDude3 = "Lebowski";
        System.out.println(theDude3);
    }
}
