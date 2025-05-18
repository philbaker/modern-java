public class FinalVariables {
    public static void main(String[] args) {
        // Final means you connot reassign the variable
        final String coolestChef = "Anthony Bourdain";
        System.out.println(coolestChef);

        final String mario;
        // Allowed
        mario = "Charles Martinet";
        System.out.println(mario);

        // Not allowed
        // mario = "Chris Pratt";
    }
}
