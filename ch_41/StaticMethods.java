class MyMath {
    static int add(int a, int b) {
        return a + b;
    }
}

class Main {
    void main() {
        int result = MyMath.add(1, 2);
        System.out.println(result);
    }
}

Main ma = new Main();
ma.main();
// 3
