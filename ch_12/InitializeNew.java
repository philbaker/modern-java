public class InitializeNew {
    public static void main(String[] args) {
        char[] mainCharacter = { 'A', 'a', 'n', 'g' };
        System.out.println(mainCharacter);
        // Aang

        char[] sideCharacter = new char[] { 'A', 'a', 'n', 'g' };
        System.out.println(sideCharacter);
        // Aang

        // new is required for performing delayed initialization of a variable
        // holding an array

        char[] element;

        element = new char[] { 'f', 'i', 'r', 'e' };
        System.out.println(element);
        // fire

        // This would not work
        // element = { 'f', 'i', 'r', 'e' };

        // The initializer coupled with new char[] is akin to an 'array expression'
        System.out.println(
            new char[] { 'K', 'a', 't', 'a', 'r', 'a' }[1]
        );
        // a
    }
}
