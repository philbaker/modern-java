public class EqualityIgnoreCase {
    void main() {
        String historicalFigureOne = "St. Valentines";
        String historicalFigureTwo = "st. valentines";

        System.out.println(
            historicalFigureOne.equalsIgnoreCase(historicalFigureTwo)
            // true
        );
    }
}
