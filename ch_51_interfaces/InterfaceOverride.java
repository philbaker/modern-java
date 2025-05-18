// You can use @Override when implementing methods that come from an interface
interface Dog {
    void bark();

    String fetch(String ball);
}

class Mutt implements Dog {
    @Override
    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public String fetch(String ball) {
        return ball + " (with drool)";
    }
}
