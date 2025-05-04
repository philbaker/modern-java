public class GrowableIntArrayOptimized {
    private int[] data;
    private int size;

    GrowableIntArrayOptimized() {
        this.data = new int[0];
        this.size = 0;
    }

    int get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        return this.data[index];
    }

    void set(int index, int value) {
        // For setting as well
        if (index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        this.data[index] = value;
    }

    int size() {
        return this.size;
    }

    void add(int value) {
        if (size >= this.data.length - 1) {
            int newLength = this.data.length * 2;
            if (newLength == 0) {
                newLength = 2;
            }

            int[] newArray = new int[newLength];
            for (int i = 0; i < this.data.length; i++) {
                newArray[i] = this.data[i];
            }
            this.data = newArray;
        }

        this.data[size] = value;
        this.size++;
    }
}

class Main {
    void main() {
        // To start we don't know how many elements there are
        var array = new GrowableIntArrayOptimized();

        // Each time we add an element the array "grows"
        array.add(1);
        array.add(2);
        array.add(3);

        // And we can loop over it
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

Main ma = new Main();
ma.main();
// 1
// 2
// 3
