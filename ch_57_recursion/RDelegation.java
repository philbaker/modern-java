// A related technique to recursion is "delegation"
// This is when you have one method call a different arity version of itself

// This is distinct from recursion since, while the method delegated to might
// have the same name as the one delegating, different overloads of methods
// are considered distinct methods

// seasonFood() is therefore a different method to seasonFood(int)

public class RDelegation {
    // This method is delegated to
    void seasonFood(int shakes) {
        for (int i = 0; i < shakes; i++) {
            System.out.println("1 shake of pepper");
        }
    }

    // by this method, which provides a "default" value of 2
    void seasonFood() {
        seasonFood(2);
    }

    void main() {
        seasonFood();
        // 1 shake of pepper
        // 1 shake of pepper
    }
}
