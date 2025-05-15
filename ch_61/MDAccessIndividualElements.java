public class MDAccessIndividualElements {
    void main() {
        String[][] ticTacToe = {
            { "O", "",  "O" },
            { "X", "O", "X" },
            { "O", "X", "X" },
        };

        System.out.println(ticTacToe[2][1]);
        // X

        // This is equivalent to above
        String[] row = ticTacToe[2];
        // String[3] { "O", "X", "X" }
        System.out.println(row[1]);
        // X
    }
}
