public class LabeledContinue {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("" + i + ", " + j);
                if (i == 0) {
                    // i++ will run
                    continue label;
                }
            }
        }
    }
}
