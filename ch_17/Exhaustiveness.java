public class Exhaustiveness {
    // int compute(int x) {
    //     if (x < 0) {
    //         return 5;
    //     }
    // }
    // Not valid because there's no return value for the second branch

    int compute(int x) {
        if (x < 0) {
            return 5;
        } else {
            return 1;
        }
    }
}
