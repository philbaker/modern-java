public class LabeledBreak {
    public static void main(String[] args) {
        outerLoop:
        for (;;) {
            for (;;) {
                break outerLoop;
            }
        }

        outerForLoop:
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            while (i < 100) {
                if (i == 5) {
                    break outerForLoop;
                }
                i++;
            }
            System.out.println(i);
        }
    }
}
