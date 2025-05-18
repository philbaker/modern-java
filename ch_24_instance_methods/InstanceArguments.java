class Muppet2 {
    String name;

    void singLyric(int verse) {
        if (verse == 1) {
            System.out.println("Why are there so many");
        }
        else if (verse == 2) {
            System.out.println("Songs about rainbows");
        }
        else {
            System.out.println("And what's on the other side?");
        }
    }
}

void main() {
    Muppet2 kermit2 = new Muppet2();
    // Muppet2@51565ec2

    kermit2.singLyric(1);
    // Why are there so many

    kermit2.singLyric(2);
    // Songs about rainbows

    kermit2.singLyric(3);
    // And what's on the other side?
}
