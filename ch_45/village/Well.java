package village;

public class Well {
    // Both of these can be used from a different package
    public static final int DEPTH = 10;
    public int remainingWater;

    // Neither of these can be used outside of the "village" package
    static final int NUMBER_OF_DEMONS = 4;
    boolean exorcismPerformed;

    public static int drawWater() {
        System.out.println("""
            You need this to be both public and static to be able to write
            Well.drawWater()
        """);

        return 235;
    }
}
