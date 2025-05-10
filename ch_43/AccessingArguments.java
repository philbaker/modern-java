public class AccessingArguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(
                "Hello Mr. " + args[i]
            );
        }
    }
}
