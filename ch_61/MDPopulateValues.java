public class MDPopulateValues {
    void main() {
        boolean[][] booleanField = new boolean[25][25];
        // boolean[25][] { boolean[25] { false, false, false ... e, false, false, false } }

        for (int i = 0; i < booleanField.length; i++) {
            for (int j = 0; j < booleanField[i].length; j++) {
                booleanField[i][j] = true;
            }
        }
        // boolean[25][] { boolean[25] { true, true, true, true, true, true, true, true, t
        // rue, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, t
        // rue }, boolean[25] { true, true, true, true, true, true, true, true, true, true, true, true, tru
        // e, true, true, true, true, true, true, true, true, true, true, true, true }, boolean[25] { true,
        //  true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
        //  true, true, true, true, true, true, true, true }, boolean[25] { true, true, true, true, true, t
        // rue, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, t
        // rue, tr ...  boolean[25] { true, true, true, true, true, true, true, true, true, true, true, tru
        // e, true, true, true, true, true, true, true, true, true, true, true, true, true }, boolean[25] {
        //  true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true,
        //  true, true, true, true, true, true, true, true, true } }
    }
}
