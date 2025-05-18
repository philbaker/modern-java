// The `@Override` you can put on methods is an annotation

interface Num {
    boolean odd();

    boolean even();
}

class IntNum implements Num {
    final int x;

    IntNum(int x) {
        this.x = x;
    }

    @Override
    public boolean odd() {
        return x % 2 != 0;
    }

    @Override
    public boolean even() {
        return !odd();
    }
}
