public class PrintContents {
    public static void main(String[] args) {
        // If you use System.out.println to output a String[] you won't see the
        // contents of the array

        String[] shout = { "fus", "ro", "dah" };
        System.out.println(shout);
        // [Ljava.lang.String;@306279ee

        int[] nums = { 11, 11, 11 };
        System.out.println(nums);
        // [I@77846d2c

        boolean[] bools = { true, false };
        System.out.println(bools);
        // [Z@2641e737

        double[] doubles = { 1.1, 1.1, 1.1 };
        System.out.println(doubles);
        // [D@fcd6521

        // The only kind of array which will include its contents when printed is a 
        // char[]. It will be printed as if it were a string
        char[] continent = { 'T', 'a', 'm', 'r', 'i', 'e', 'l' };
        System.out.println(continent);
        // Tamriel

        int index = 0;
        while (index < continent.length) {
            System.out.println(continent[index]);
            index += 1;
        }

        // If you want to see the actual contents of an array use a loop
        String[] factions = { "empire", "stormcloaks", "dragons" };

        int index2 = 0;
        while (index2 < factions.length) {
            System.out.println(factions[index2]);
            index2 += 1;
        }
    }
}
