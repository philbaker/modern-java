public class RAccumulators {
    // A common thing to do with loops is to "accumulate" some value each time
    // you go through the loop

    int timesTwo(int x) {
        int total = 0;
        while (x > 0) {
            total += 2;
            x --;
        }

        return total;
    }

    // To accomplish the same task with recursion you need 1. an extra "accumulator"
    // argument to your function and 2. an overload of the method which takes
    // all the same arguments minus the accumulator

    int timesTwoR(int x, int accumulator) {
        if (x > 0) {
            return timesTwoR(x - 1, accumulator + 2);
        } else {
            return accumulator;
        }
    }

    int timesTwoR(int x) {
        return timesTwoR(x, 0);
    }

    void main() {
        System.out.println(
            timesTwo(4)
        );
        // 8

        System.out.println(
            timesTwoR(4)
        );
        // 8
    }
}
