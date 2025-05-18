public class StaticInitialization {
    static int count;
    static String name;

    // If you want to initialize them to a different value you can assign
    // directly rather than using the constructor
    static int count2 = 5;
    static String name2 = "bob";

    // Or you can initialize them in a 'static block'
    static int count3;
    static String name3;

    // The rules for static blocks are complicated. Avoid doing anything "interesting"
    // in them
    static {
        count3 = 7;
        name3 = "bobby";
    }

    void main() {
        System.out.println(count);
        // 0
        System.out.println(name);
        // null

        System.out.println(count2);
        // 5
        System.out.println(name2);
        // bob

        System.out.println(count3);
        // 7
        System.out.println(name3);
        // bobby
    }
}

// StaticInitialization st = new StaticInitialization();
// st.main();

