public class FinalVariables {
    public static void main(String[] args) {
        // Just like anything else, arrays can be stored in variables marked final

        // This means that the variable cannot be reassigned, but it does not mean
        // that the array's contents cannot be changed directly or through an alias

        final char[] catchphrase = { 'w', 'o', 'a', 'h', '!' };

        System.out.println(catchphrase);
        // woah!

        // Cannot reassign
        // catchphrase = new char[] { 'e', 'g', 'a', 'd', 's' };
        // but can set elements directly
        catchphrase[0] = 'e';
        catchphrase[1] = 'g';

        // or through an alias
        char[] alias = catchphrase;
        alias[2] = 'a';
        alias[3] = 'd';
        alias[4] = 's';

        System.out.println(catchphrase);
        // egads
    }
}
