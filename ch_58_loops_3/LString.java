// String does not implement the Iterable interface

public class LString {
    void main() {
        String letters = "abc";
        // for (char letter : letters) {
        //     System.out.println(letter);
        // }
        // Error:
        // for-each not applicable to expression type
        //   required: array or java.lang.Iterable
        //   found:    java.lang.String

        // To loop over all the characters in a String, use a regular loop
        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);
            System.out.println(letter);
        }
        // a
        // b
        // c
    }
}
