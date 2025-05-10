public class IntegerToString {
    void main() {
        int x = 4;
        String xStr = "" + x;

        System.out.println(xStr);
        // "4"

        int x2 = 4;
        String xStr2 = Integer.toString(x2);

        System.out.println(xStr2);
        // "4"
    }
}
