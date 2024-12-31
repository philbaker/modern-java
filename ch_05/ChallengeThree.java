public class ChallengeThree {
    public static void main(String[] args) {
        boolean hasIceCream = true;
        boolean hasCookie = false;

        boolean validChoice = (hasIceCream && !hasCookie) || (!hasIceCream && hasCookie);

        System.out.println(validChoice);
    }
}
