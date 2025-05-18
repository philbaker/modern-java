// A short represents a signed value between -32768 and 32767
// Representing a short takes twice as much memory as a byte and half as much
// as an int

public class NShort {
    void main() {
        short a = 32767;
        System.out.println(a);
        // 32767
        short b = -32768;
        System.out.println(b);
        // -32768

        // Operations like + and * will promote a short to an int
        short c = 5;
        short d = 6;

        // Need to cast the result to a short again
        short e = (short) (c * d);
        System.out.println(e);
        // 30

        // Going from short to int is a widening conversion and you won't need
        // a cast
        short f = 5;
        int g = f;
        System.out.println(g);
        // 5

        // Short is the boxed version
        Short h = null;
        System.out.println(h);
        // null

        // A short takes up exactly the same space as a char. Converting between the
        // two is allowed but still requires an explicit cast in both directions
        short i = 50;
        char j = (char) i;
        short k = (short) j;
        System.out.println(k);
        // 50

        // short is useful when you need to save space in memory but need to
        // represent numbers beyond what a byte can represent

        // this array of 2 shorts
        short[] shorts = { 1, 2 };

        // will take up as much space as this array with 1 int
        int[] oneInt = { 1 };

        // and as much space as this array with 4 bytes
        byte[] bytes = { 1, 2, 3, 4};
    }
}
