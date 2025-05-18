public class CheckBlank {
    void main() {
        String brainSounds = """

        """;
        System.out.println(brainSounds.isEmpty());
        // false

        System.out.println(brainSounds.isBlank());
        // true
    }
}
