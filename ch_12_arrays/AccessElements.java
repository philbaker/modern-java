public class AccessElements {
    public static void main(String[] args) {
        String[] lyrics = { "you", "say", "goodbye" };

        String you = lyrics[0];
        System.out.println(you);

        String say = lyrics[1];
        System.out.println(say);

        String goodbye = lyrics[2];
        System.out.println(goodbye);

        int index = 2;
        String[] lyrics2 = { "I", "say", "hello" };

        System.out.println(lyrics2[index]);

        // Error
        // System.out.println(lyrics2[999]);
        // System.out.println(lyrics2[-1]);
    }
}
