public class LabeledContinue {
    public static void main(String[] args) {
        outerLoop:
        while (true) {
            System.out.println("inside outer loop");
            while (true) {
                System.out.println("inside inner loop");
                continue outerLoop;
            }
        }
    }
}
