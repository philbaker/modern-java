public class InferredTypes {
    // var can't be used for arguments
    // void makeHorchata(var milkFatPercent) {
    // }

    void makeHorchata(double milkFatPercent) {
        System.out.println(
            "Making a horchata with " + milkFatPercent + "% milk."
        );
    }
}
