public class EmptyExpressions {
    public static void main(String[] args) {
        for (int i = 0;; i++) {
            // The loop will run forever if there is not an explicit break
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
