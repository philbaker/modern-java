public class While {
    public static void main(String[] args) {
        int x = 5;

        while (x != 0) {
            System.out.println(x);
            x--;
        }

        int glassesOfMilk = 99;

        while (glassesOfMilk > 0) {
            System.out.println(
                glassesOfMilk + " glasses of milk left"
            );

            glassesOfMilk--;
        }
    }
}
