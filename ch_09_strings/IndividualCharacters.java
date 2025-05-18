public class IndividualCharacters {
    public static void main(String[] args) {
        String spy = "loid";

        char l = spy.charAt(0);
        System.out.println(l);

        char o = spy.charAt(1);
        System.out.println(o);

        char i = spy.charAt(2);
        System.out.println(i);

        char d = spy.charAt(3);
        System.out.println(d);

        String assassin = "yor";
        int indexOfR = 2;

        char r = assassin.charAt(indexOfR);
        System.out.println(r);

        String student = "anya";
        // student.charAt(999); - error

        String dog = "bond";
        // dog.charAt(-1); - error
    }
}
