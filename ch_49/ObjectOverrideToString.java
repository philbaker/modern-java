class Window {
    public String toString() {
        return "Window";
    }
}

public class ObjectOverrideToString {
    void main() {
        Object o = new Window();
        System.out.println(o);
        // "Window"

        Object o2 = new Position(9, 8);
        System.out.println(o2);
        // "Position[x=9, y=8]"
    }
}

// It is common practice for a class holding data to incnlude the value of its 
// fields in its toString representation. This can be helpful for debugging
class Position {
    int x;
    int y;

    Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Position[x=" + x + ", y=" + y + "]";
    }
}
