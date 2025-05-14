// Prior to having -> in Switch statements Java only had the C-style switch
// statement using :

public class SBreak {
    void main() {
        String name = "Piccolo";
        switch (name) {
            case "Squidward":
                System.out.println("Invited, but not coming");
                break;

            case "Piccolo":
                System.out.println("Coming to the cookout.");
                break;

            case "Spider-Man":
                System.out.println("Not coming");
                break;
        }
        // Coming to the cookout.

        // This is different to breaking out of a loop and won't break out of
        // any surrounding loops
        for (int i = 0; i < 3; i++) {
            // Will still run 3 times
            String name2 = "Piccolo";
            switch (name2) {
                case "Squidward":
                System.out.println("Invited, but not coming");
                break;

                case "Piccolo":
                System.out.println("Coming to the cookout.");
                break;

                case "Spider-Man":
                System.out.println("Not coming");
                break;
            }
        }
        // Coming to the cookout.
        // Coming to the cookout.
        // Coming to the cookout.

        // To break out of surrounding loops you can use a labelled break
        outerLoop:
        for (int i = 0; i < 3; i++) {
            // Will still run 3 times
            String name3 = "Piccolo";
            switch (name3) {
                case "Squidward":
                System.out.println("Invited, but not coming");
                break;

                case "Piccolo":
                System.out.println("Coming to the cookout.");
                break outerLoop;

                case "Spider-Man":
                System.out.println("Not coming");
                break;
            }
        }
        // Coming to the cookout.
    }
}
