// ArrayList implements Iterable

import java.util.Iterator;
import java.util.ArrayList;

public class LArrayList {
    void main() {
        ArrayList<String> donutEaters = new ArrayList<>();
        donutEaters.add("Chief Wiggum");
        donutEaters.add("Homer Simpson");

        Iterator<String> donutEatersIterator = donutEaters.iterator();

        while (donutEatersIterator.hasNext()) {
            String donutEater = donutEatersIterator.next();

            System.out.println(donutEater + " eats donuts");
        }
        // Chief Wiggum eats donuts
        // Homer Simpson eats donuts

        for (String donutEater : donutEaters) {
            System.out.println(donutEater + " eats donuts");
        }
        // Chief Wiggum eats donuts
        // Homer Simpson eats donuts
    }
}
