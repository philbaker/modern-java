public class CombiningCases {
    String scientificName(String vegetable) {
        switch (vegetable) {
            case "apple" -> {
                return "Malus pumila";
            }
            case "cabbage", "brussel sprouts", "kale", "cauliflower" -> {
                return "Brassica oleracea";
            }
            default -> {
                return "unknown";
            }
        }
    }

    void main() {
        scientificName("kale");
        // "Brassica oleracea"
    }
}
