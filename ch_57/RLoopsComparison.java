// Everything that can be accomplished by using loops can be accomplished using
// recursion.
// This means it is always possible to take some code using loops and translate
// it mechanically to code using recursion

// There are times when recursion provides a tidier solution than looping
// e.g. walking a tree. It is possible with loops but requires keeping track
// of what you've done with a data structure.

public class RLoopsComparison {
    void seasonFoodRecursive(int times) {
        if (times == 0) {
            return;
        } else {
            System.out.println("seasoning");
            seasonFoodRecursive(times - 1);
        }
    }

    void seasonFoodIterative(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("seasoning");
        }
    }

    void main() {
        seasonFoodRecursive(4);
        // seasoning
        // seasoning
        // seasoning
        // seasoning

        seasonFoodIterative(4);
        // seasoning
        // seasoning
        // seasoning
        // seasoning
    }
}
