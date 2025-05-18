public class InitializerVLiteral {
    public static void main(String[] args) {
        String name = "Alana";
        System.out.println(name.charAt(1));

        // You can also perform the above operation on the literal itself
        System.out.println("Alana".charAt(1));
        // l

        // Array initializers work when you assign them to a variable
        char[] name2 = { 'A', 'm', 'a', 'n', 'd', 'a' };
        System.out.println(name2[1]);
        // m

        // but not if you perform the operations directly
        // System.out.println({ 'A', 'm', 'a', 'n', 'd', 'a' }[1]);
        // Will not run
    }
}
