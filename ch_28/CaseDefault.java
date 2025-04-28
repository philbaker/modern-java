public class CaseDefault {
    void sayColor(String fruit) {
        switch (fruit) {
            case "apple" -> {
                System.out.println("Red");
            }
            case "grape" -> {
                System.out.println("Purple");
            }
            case "orange" -> {
                System.out.println("Orange");
            }
            default -> {
                System.out.println("Other");
            }
        }
    }

    void main() {
        sayColor("grape");
        // Purple
    }
}
