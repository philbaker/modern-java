// long is twice as big as an int and can represent numbers from -2^63 to 2^63 - 1

public class NLong {
    void main() {
        // Smaller numbers work without issue
        long smallNumber = 5;
        System.out.println(smallNumber);

        // This is too big for an int. In these cases an L is needed at the end
        long bigNumber = 55555555555L;
        System.out.println(bigNumber);
        // 55555555555

        // All operations with a long will result in a long
        // Conversions to int and other smaller integer types will be narrowing and
        // require a cast
        long a = 5;
        long b = 3;
        long c = a * b;
        System.out.println(c);
        // 15

        // If you have need of a potentially nullable long, Long is the boxed version
        Long l = null;
        System.out.println(l);
        // null

        // You'll likely end up using int more than long. int works more with
        // other parts of Java. Like array indexing
        String[] sadRobots = { "2B", "9S", "A2" };
        long index = 2;
        // longs can't be used as indexes
        // String sadRobot = sadRobots[index];
        // Error:
        // incompatible types: possible lossy conversion from long to int
        //         String sadRobot = sadRobots[index];

        int indexInt = 2;
        String sadRobot = sadRobots[indexInt];
        System.out.println(sadRobot);
        // "A2"
    }
}
