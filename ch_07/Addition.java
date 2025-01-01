public class Addition {
    public static void main(String[] args) {
        double x = 5.1;
        double y = x + 9.1;
        System.out.println(y);

        double z = x + y;
        System.out.println(z);

        int x2 = 5;
        double y2 = 4.4;
        double z2 = x + y;

        System.out.println(x2);
        System.out.println(y2);
        System.out.println(z2);

        int x3 = 5;
        double y3 = 4;
        // int z3 = x3 + y3; // does not work because result is a double
    }
}
