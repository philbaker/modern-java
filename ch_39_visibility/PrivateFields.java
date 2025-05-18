public class PrivateFields {
    // You can also mark a field as private
    // This makes it so that code in other files cannot see or change the field directly
    private int timesLostToGodzilla;

    PrivateFields() {
        this.timesLostToGodzilla = 0;
    }

    void fightGodzilla() {
        this.timesLostToGodzilla++;
    }

    boolean isLoser() {
        return this.timesLostToGodzilla > 0;
    }
}
