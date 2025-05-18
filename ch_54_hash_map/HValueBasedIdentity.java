// Value based identity is where the two things are the same if they contain
// the same data i.e. if they represent the same value

// Strings, all numeric types like Integer and Double as well as Booleans are defined
// in this way. As are records and enums

record Pos(int x, int y) {}

public class HValueBasedIdentity {
    void main() {
        // Strings A and B are distinct instances
        var stringA = new String(new char[] { 'a', 'b', 'c' });
        var stringB = new String(new char[] { 'a', 'b', 'c' });

        // but they have the same hashCode
        System.out.println(stringA.hashCode());
        // 96354
        System.out.println(stringB.hashCode());
        // 96354

        // and will be equal to each other
        System.out.println(stringA.equals(stringB));
        // true
        System.out.println(stringB.equals(stringA));
        // true

        // Positions A and B are distinct instances but hold the same values
        var posA = new Pos(5, 5);
        var posB = new Pos(5, 5);

        // therefore they have the same hashcode
        System.out.println(posA.hashCode());
        // 160
        System.out.println(posB.hashCode());
        // 160

        // and will be equal to each other
        System.out.println(posA.equals(posB));
        // true
        System.out.println(posB.equals(posA));
        // true
    }
}
