public class ReturnStatement {
    int doMath() {
        int x = 0;

        while (x < 6) {
            x++;

            if (x == 8) {
                return x;
            }
        }

        return 0;
    }
}
