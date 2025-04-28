public class OmittedDefault {
    // default can be omitted. It is conceptually the same as omitting a final
    // else from a chain of ifs and else ifs

    void react(String fruit) {
        switch (fruit) {
            case "apple" -> {
                System.out.println("WOW");
            }
            case "orange" -> {
                System.out.println("Zoinks!");
            }
            case "grape" -> {
                System.out.println("Zoopers!");
            }
        }
    }

    void main() {
        react("passionfruit");
    }
}
