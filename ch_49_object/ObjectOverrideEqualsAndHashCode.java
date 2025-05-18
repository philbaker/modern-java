import java.util.Objects;

class Position {
    int x;
    int y;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Position otherPosition) {
            return this.x == otherPosition.x && this.y == otherPosition.y;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.x, this.y);
    }
}

class Tree {
    String barkDescription;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Tree otherTree) {
            return this.barkDescription.equals(otherTree.barkDescription);
        } else {
            return false;
        }
    }
}
