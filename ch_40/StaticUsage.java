class StaticUsage {
    static int count = 5;

    void main() {
        System.out.println(count);
    }
}

class Main {
    static int count = 0;

    void main() {
        // To use a static field from another class use ClassName.fileldName
        System.out.println(StaticUsage.count);
    }
}

Main main = new Main();
main.main();
// 5
