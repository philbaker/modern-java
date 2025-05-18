public class BoxedCharacter {
    void main() {
        Character c = null;
        System.out.println(c);
        c = '%';
        System.out.println(c);

        // Unlike a char[] a Character[] will not have its contents shown when
        // printed

        char[] c1 = new char[] { 'a', 'b', 'c' };
        System.out.println(c1);

        Character[] c2 = new Character[] { 'a', 'b', 'c' };
        System.out.println(c2);
    }
}
