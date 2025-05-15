// If you are looping over a collection with a for-each loop you generally
// cannot remove things from that collection at the same time
// this would trigger a ConcurrentModificationException

import java.util.ArrayList;

record Sandwich(
    int turkeySlices,
    int cheeseSlices,
    boolean mayo
) {}

public class LConcurrentModifications {
    void main() {
        ArrayList<Sandwich> sandwiches = new ArrayList<>();
        var turkeyAndCheddar = new Sandwich(2, 2, true);
        var grilledCheese = new Sandwich(0, 4, false);
        var bigTurkeyAndCheddar = new Sandwich(10, 10, true);
        var theWisconsinFreak = new Sandwich(0, 20, true);

        sandwiches.add(turkeyAndCheddar);
        sandwiches.add(grilledCheese);
        sandwiches.add(bigTurkeyAndCheddar);
        sandwiches.add(theWisconsinFreak);

        // for (Sandwich sandwich : sandwiches) {
        //     if (sandwich.mayo()) {
        //         sandwiches.remove(sandwich);
        //     }
        // }
        // Exception java.util.ConcurrentModificationException
        //       at ArrayList$Itr.checkForComodification (ArrayList.java:1095)
        //       at ArrayList$Itr.next (ArrayList.java:1049)

        // If needed this can be achieved with a regular loop

        System.out.println(sandwiches);
        // [Sandwich[turkeySlices=0, cheeseSlices=4, mayo=false], Sandwich[turkeySlices=10, cheeseSlices=10
        // , mayo=true], Sandwich[turkeySlices=0, cheeseSlices=20, mayo=true]]

        for (int i = 0; i < sandwiches.size(); i++) {
            Sandwich sandwich = sandwiches.get(i);
            if (sandwich.mayo()) { // Some people don't like Mayo
                sandwiches.remove(sandwich);
                i--; // Subtracting one from our current index syncs us back up
            }
        }

        System.out.println(sandwiches);
        // [Sandwich[turkeySlices=0, cheeseSlices=4, mayo=false]]
    }
}

