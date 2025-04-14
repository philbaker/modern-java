public class Break {
    public static void main(String[] args) {
        int x = 5;

        while (x > 0) {
            if (x == 2) {
                break;
            }
            x--;
        }

        System.out.println(
            "Final vlaue of x is " + x
        );
    }
}
