public class Void {
    String title() {
        return "All Night";
    }

    int views() {
        return 4071;
    }

    void talkAboutVideo() {
        System.out.println(title() + " only has " + views() + " views. ");
    }

    void main() {
        talkAboutVideo();
    }
}
