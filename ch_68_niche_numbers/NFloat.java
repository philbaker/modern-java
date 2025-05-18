// if you want something half the size of a double you can use a float

public class NFloat {
    void main() {
        // a trailing f is needed for Java to see a float
        float f = 3.5f;
        System.out.println(f);
        // 3.5

        // conversions from double to float are a narrowing and require an explicit
        // cast. Conversions from float to double are widening and do not require
        // a cast
        double a = 6.5;
        float b = (float) a;
        System.out.println(b);
        // 5.0

        float c = 9.5f;
        double d = c;
        System.out.println(d);
        // 9.5

        // if you need a potentially nullable float, Float is the boxed version
        Float e = null;
        System.out.println(e);
        // null

        // You only really need a float when you are trying to save space in
        // memory. Otherwise it's best to use a double

        // This array of 2 floats
        float[] floats = { 1.0f, 2.0f };
        // Will take up as much space as this array with 1 double
        double[] oneDouble = { 1.0 };
    }
}
