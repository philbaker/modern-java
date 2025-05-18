public class MDSetIndividualElements {
    void main() {
        String[][] ticTacToe = {
            { "", "", "" },
            { "", "", "" },
            { "", "", "" },
        };
        // String[3][] { String[3] { "", "", "" }, String[3] { "", "", "" }, String[3] { "", 

        ticTacToe[0][0] = "X";

        String[] row = ticTacToe[0];
        row[1] = "0";

        // String[3][] { String[3] { "X", "0", "" }, String[3] { "", "", "" }, String[3] { ""
        // , "", "" } }
    }
}
