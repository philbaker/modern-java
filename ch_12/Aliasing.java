public class Aliasing {
    public static void main(String[] args) {
        // When you assign a variable containing an array to another variable,
        // the array referenced by both variables will be the exact same

        // If the contents of the array are updated, that change will be reflected
        // by both variables

        // When two variables point to the same thing like this we say that both
        // variables are 'aliases' for eachother

        char[] lettersOne = { 'B', 'a', 't', 'm', 'a', 'n' };
        char[] lettersTwo = lettersOne;

        System.out.println(lettersOne);
        System.out.println(lettersTwo);
        // Batman

        lettersOne[0] = 'C';

        System.out.println(lettersOne);
        System.out.println(lettersTwo);
        // Batman

        lettersTwo[0] = 'R';

        System.out.println(lettersOne);
        System.out.println(lettersTwo);
        // Batman
    }
}
