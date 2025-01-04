public class Concatenation {
    public static void main(String[] args) {
        String he = "he";
        String llo = "llo";

        String hello = he + llo;

        System.out.println(hello);

        int numberOfApples = 5;
        double dollars = 1.52;

        String message = "I have " + numberOfApples +
        " apples and $" + dollars + " in my pocket.";

        System.out.println(message);

        String lyricOne = "Green, Green, Dress";
        String lyricTwo = "Green, Green, Dress";

        boolean areSameLyric = lyricOne.equals(lyricTwo);
        boolean isMyName = lyricOne.equals("Bop Bop");

        System.out.println(areSameLyric);
        System.out.println(isMyName);

        String bow = "bow";
        String wow = "WOW";

        boolean areNotSame = !bow.equals(wow);

        System.out.println(areNotSame);
    }
}
