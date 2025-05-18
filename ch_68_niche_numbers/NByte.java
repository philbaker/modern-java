// A byte represents a signed value between -128 and 127

public class NByte {
    void main() {
        byte a = 127;
        System.out.println(a);
        // 127
        byte b = -128;
        System.out.println(b);
        // -128

        byte c = 5;
        byte d = 6;
        // Operations like + and * on a byte will promote the result to an int
        // Need to cast the result to a byte again if you want a byte
        // This is a narrowing conversion
        byte e = (byte) (c * d);
        System.out.println(e);
        // 30

        // Going from byte to an int is a widening conversion and you won't
        // need a cast
        byte f = 5;
        int g = f;
        System.out.println(g);
        // 5

        // If you need a nullable byte, Byte is the boxed version
        Byte h = null;
        System.out.println(h);
        // null

        // byte is useful whe you are trying to save space in memory
        // these use equivalent space
        byte[] bytes = { 1, 2, 3, 4 };
        int[] oneInt = { 1 };
    }
}
