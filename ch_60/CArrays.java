import java.util.List;
import java.util.Arrays;

// Arrays are similar to List but not the same

public class CArrays {
    void main() {
        String[] furniture = new String[] {
            "Ottoman",
            "Table",
            "Dresser",
        };
        // String[3] { "Ottoman", "Table", "Dresser" }

        // Arrays.asList allows you to make a List which is a view over an array
        List<String> furnitureList = Arrays.asList(furniture);
        // [Ottoman, Table, Dresser]

        // Changes made to the List returned from Arrays.asList will be reflected
        // in the underlying array
        furnitureList.set(0, "Recliner");

        System.out.println(Arrays.toString(furniture));
        // [Recliner, Table, Dresser]

        // Any methods on List which try to perform operations that an array
        // cannot support e.g. .add will throw exceptions
        // furnitureList.add("Shelf");
        // Exception java.lang.UnsupportedOperationException
        //       at AbstractList.add (AbstractList.java:155)
        //       at AbstractList.add (AbstractList.java:113)
    }
}
