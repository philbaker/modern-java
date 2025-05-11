class Thing {}

class Main {
    void main() {
        var t1 = new Thing();
        var t2 = new Thing();

        System.out.println(t1 == t1);
        // true
        System.out.println(t1.equals(t1));
        // true

        System.out.println(t2 == t2);
        // true
        System.out.println(t2.equals(t2));
        // true

        System.out.println(t1 == t2);
        // false
        System.out.println(t1.equals(t2));
        // false

        Integer a = 3;
        Integer b = 3;
        Integer c = 4;

        System.out.println(a.equals(b));
        // true
        System.out.println(a.equals(c));
        // false

        String a2 = "abc";
        String b2 = "abc";
        String c2 = "bca";

        System.out.println(a.hashCode());
        // 3
        System.out.println(b.hashCode());
        // 3
        System.out.println(c.hashCode());
        // 4

        System.out.println(t1.hashCode());
        // 319977154
        System.out.println(t2.hashCode());
        // 1071097621
    }
}


