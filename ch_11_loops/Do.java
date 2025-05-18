public class Do {
    public static void main(String[] args) {
        int x = 0;

        do {
            System.out.println(x);
            x++;
        } while (x < 5);

        int y = 0;

        // The do-while loop always runs at least one time
        do {
            System.out.println("this will run");
        } while (y != 0);

        while (y != 0) {
            System.out.println("this will not run");
        }
    }
}
