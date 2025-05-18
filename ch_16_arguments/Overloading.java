public class Overloading {
    // Multiple methods can be declared with the same name as long as each method
    // takes different types or different numbers of arguments
    void doThing(int x) {
        System.out.println(x);
    }

    void doThing(String name) {
        System.out.println("Hello " + name);
    }

    void doThing(int x, int y) {
        System.out.println(x + y);
    }

    // When you call the method, Java will know what code to run because it knows
    // the types of and number of arguments you are passing

    void main() {
        doThing(1);
        doThing("abc");
        doThing(1, 2);
    }
}
