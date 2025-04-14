public class Continue {
    public static void main(String[] args) {
        int x = 5;
        while (x > 0) {
            if (x == 4) {
                // Stops the loop running immediately but the condition of the
                // loop is checked again. If it evaluates to true then the code
                // in the loop will run again
                continue;
            }
            System.out.println(x + " is a good number");
            x--;
        }
    }
}
