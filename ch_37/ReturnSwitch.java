public class ReturnSwitch {
    void main() {
        // If you choose to, you do not need to assign the result of a switch
        // experssion into a variable. You can directly return the result from
        // a method

        enum Bird {
            TURKEY,
            EAGLE,
            WOODPECKER
        }

        boolean isScary(Bird bird) {
            return switch (bird) {
                case TURKEY -> true;
                case EAGLE -> true;
                case WOODPECKER -> true;
            };
        }

        System.out.println(isScary(Bird.TURKEY));
        // true
    }
}
