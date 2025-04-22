public class ArraysBoxed {
    void main() {
        // If you have an array of the boxed version of a type, that is not compatible
        // with an array containing the unboxed version and vice-versa
        int[] numbersOne = { 1, 2, 3 };
        Integer[] numbersTwo = { 4, 5, 6 };

        // numbersOne = numbersTwo;
        // numbersTwo = numbersOne;
        // Neither of these will work

        // In order to turn something like boolean[] into Boolean[] you must
        // make a new array and copy over elements

        boolean[] yesAndNo = new boolean[] { true, false };

        Boolean[] yesAndNoCopy = new Boolean[] { false, false };

        for (int i = 0; i < yesAndNo.length; i++) {
            yesAndNoCopy[i] = yesAndNo[i];
        }

        boolean[] yesAndNoCopy2 = new boolean[] { false, false };

        for (int i = 0; i < yesAndNoCopy.length; i++) {
            yesAndNoCopy2[i] = yesAndNoCopy[i];
        }
    }
}
