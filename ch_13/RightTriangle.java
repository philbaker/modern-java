public class RightTriangle {
    public static void main(String[] args) {
        System.out.println("*\n**\n***\n");

        for (int numberOfStars = 1; numberOfStars <= 3; numberOfStars++) {
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int height = 6;
        for (int numberOfStars = 1; numberOfStars <= height; numberOfStars++) {
            for (int i = 0; i < numberOfStars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
