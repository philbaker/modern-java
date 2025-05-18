public class SetElements {
    public static void main(String[] args) {
        String[] sentence = { "you", "are", "found", "guilty" };
        System.out.println(
            sentence[0]
                + " "
                + sentence[1]
                + " "
                + sentence[2]
                + " "
                + sentence[3]
        );

        sentence[1] = "aren't";
        System.out.println(
            sentence[0]
                + " "
                + sentence[1]
                + " "
                + sentence[2]
                + " "
                + sentence[3]
        );

        int index = 2;
        String[] response = { "and", "it", "isn't", "opposite", "day" };
        System.out.println(
            response[0]
                + " "
                + response[1]
                + " "
                + response[2]
                + " "
                + response[3]
                + " "
                + response[4]
        );

        response[index] = "is";
        System.out.println(
            response[0]
                + " "
                + response[1]
                + " "
                + response[2]
                + " "
                + response[3]
                + " "
                + response[4]
        );

        String[] response2 = { "objection" };
        response[1] = "!";

        String[] response3 = { "sustained" };
        // Error
        // response[-1] = "not";
    }
}
