public class InferredTypes {
    public static void main(String[] args) {
        // var can be used in place of int here but no real point
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // it can be useful if the for loop does something like this
        for (var repeated = ""; repeated.length() < 5; repeated = repeated + "a") {
            System.out.println(repeated);
        }
    }
}
