// A byte typically represents values from -128 to 127, but it's often used to
// represent values from 0 to 255 instead. This is called "unsigned," where 
// negative numbers are repurposed as positive ones.

// All of Java's built-in numeric types are signed but you can use static methods
// to perform operations on them that work as if they were unsigned

public class NUnsignedOperations {
    void main() {
        // Java sees 255 as being outside of the range of a byte so we have to cast
        byte b = (byte) 255;
        System.out.println(b);
        // -1

        System.out.println(Byte.toUnsignedInt(b));
        // 255

        int i = -1;
        System.out.println(Integer.toUnsignedString(i));
        // 4294967295

        boolean isFiveBigger = 5 > i;
        System.out.println(isFiveBigger);
        // true

        // You need to use special unsigned comparisons to do unsigned math
        boolean isFiveBigger2 = Integer.compareUnsigned(5, i) > 0;
        System.out.println(isFiveBigger2);
        // false
    }
}



