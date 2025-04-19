/**
 * Continue
 */
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                // i++ will still run
                continue;
            }
            System.out.println(i);
        }

        // Infinite loop
        // int i = 0;
        // while (i < 5) {
        //     if (i == 2) {
        //         continue;
        //     }
        //     System.out.println(i);
        //
        //     i++;
        // }

        // Equivalent to the for loop
        int i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                continue;
            }
            System.out.println(i);

            i++;
        }
    }
}
