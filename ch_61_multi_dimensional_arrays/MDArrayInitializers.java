public class MDArrayInitializers {
    void main() {
        // To give an initial value to a multi-dimensional array you can use
        // multiple nested array initializers

        // These are the same as normal array initializers but with potentially
        // more initializers inside

        String[][] ticTacToe = {
            { "O", "",  "O" },
            { "X", "O", "X" },
            { "O", "X", "X" },
        };
        // String[3][] { String[3] { "O", "", "O" }, String[ ... ing[3] { "O", "X", "X" } }
    }
}
