public class ReturnInVoid {
    void doStuff() {
        int i = 0;

        while (i < 12) {
            if (i == 8) {
                return;
            }

            i++;

            System.out.println(i);
        }
    }
}
