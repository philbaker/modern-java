import java.util.ArrayList;

public class ArrayLRemove {
    void main() {
        ArrayList<String> names = new ArrayList<>();
        names.add("The Bowry King");
        names.add("The Elder");
        names.add("The Harbinger");

        System.out.println(names);
        // [The Bowry King, The Elder, The Harbinger]

        names.remove("The Elder");

        System.out.println(names);
        // [The Bowry King, The Harbinger]


        names.add("The Elder");

        names.remove(2);
        names.remove(0);

        System.out.println(names);
        // [The Harbinger]

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        numbers.remove(1);
        // Removes the number 2 at index 1 which may not be expected
        // This is because int and Integer are slightly different

        System.out.println(numbers);
        // [1, 3]

        // To get something working as expected use Integer.valueOf

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);

        System.out.println(numbers2);
        // [1, 2, 3]

        numbers2.remove(Integer.valueOf(1));

        System.out.println(numbers2);
        // [2, 3]
    }
}
