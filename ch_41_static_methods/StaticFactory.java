class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static Position fromX(int x) {
        return new Position(x, 0);
    }

    static Position fromY(int y) {
        return new Position(0, y);
    }
}

class Main {
    void main() {
        var p1 = new Position(1, 2);
        var p2 = Position.fromX(4);
        var p3 = Position.fromY(5);

        System.out.println(p1.x + ", " + p1.y);
        System.out.println(p2.x + ", " + p2.y);
        System.out.println(p3.x + ", " + p3.y);
    }
}

Main mn = new Main();
mn.main();
// 1, 2
// 4, 0
// 0, 5
