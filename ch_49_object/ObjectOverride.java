// If you intend to override a method you should put @Override above that method

class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Position[x=" + x + ", y=" + y + "]";
    }
}

public class ObjectOverride {
    void main() {
        Object o = new Position(9, 8);
        System.out.println(o);
        // "Position[x=9, y=8]"
    }
}
