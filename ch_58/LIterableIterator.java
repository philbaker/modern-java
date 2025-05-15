import java.util.NoSuchElementException;

// For things that are not arrays, for-each loops are built on top of two interfaces:
// java.lang.Iterable and java.lang.Iterator

// The Iterator interface defines two methods: hasNext and next

interface Iterator<T> {
    // Will return true if there are more elements, false otherwise
    boolean hasNext();

    // Gets an element and advances the iterator forward
    T next();
}

interface Iterable<T> {
    // Gives a "fresh" Iterator
    Iterator<T> iterator();
}

class MyList implements Iterable<String> {
    private String[] items;

    public MyList(String[] items) {
        this.items = items;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < items.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return items[index++];
        }
    }
}

public class LIterableIterator {
    public static void main(String[] args) {
        String[] data = {"One", "Two", "Three"};
        MyList myList = new MyList(data);

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // One
        // Two
        // Three
    }
}
