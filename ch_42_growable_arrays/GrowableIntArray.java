public class GrowableIntArray {
    // Store an int[] internally
    private int[] data;

    GrowableIntArray() {
        // Make sure to initialize it correctly
        this.data = new int[0];
    }

    // When someone wants to get an item, get it from the array
    int get(int index) {
        return this.data[index];
    }

    // Same deal when someone wants to set an item at an index
    void set(int index, int value) {
        this.data[index] = value;
    }

    // And we need an accessor for the size so that someone can loop over the
    // array
    int size() {
        return this.data.length;
    }

    void add(int value) {
        // Copy the old array to a new, bigger one
        int[] newArray = new int[this.data.length + 1];
        for (int i = 0; i < this.data.length; i++) {
            newArray[i] = this.data[i];
        }

        // Then put the new element at the end
        newArray[newArray.length - 1] = value;

        // And swap the array
        this.data = newArray;
    }
}

class Main {
    void main() {
        // To start we don't know how many elements there are
        var array = new GrowableIntArray();

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

// Note this works but does not perform well. Since we copy the underlying array
// every time someone adds a new element it can be expensive to add a lot of 
// elements
