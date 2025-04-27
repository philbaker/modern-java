class SpaceMarine {
    boolean corrupted;
    String name;
}

class Challenges {
    void arise(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new RuntimeException("String cannot be blank or empty.");
        }

        System.out.println("Awake " + name);
    }

    void challengeOne() {
        arise("Lion El'Jonson");
        // Awake Lion El'Jonson

        arise("Roboute Guilliman");
        // Awake Roboute Guilliman

        arise("");
        // |  Exception java.lang.RuntimeException: String cannot be blank or empty.
        // |        at arise (#28:3)
        // |        at (#31:1)
    }

    void challengeTwo() {
        arise("");
        arise("   ");
        // |  Exception java.lang.RuntimeException: String cannot be blank or empty.
        // |        at arise (#28:3)
        // |        at (#33:1)
    }


    void a(int x) {
        if (x == 0) {
            throw new RuntimeException();
        }
        else {
            b(x / 2);
        }
    }

    void b(int x) {
        if (x == 0) {
            throw new RuntimeException();
        }
        else {
            c(x * 3 + 5);
        }
    }

    void c(int x) {
        if (x == 0) {
            throw new RuntimeException();
        }
        else {
            d(x / 4);
        }
    }

    void d(int x) {
        if (x == 0) {
            throw new RuntimeException();
        }
        else {
            e(x / 3);
        }
    }

    void e(int x) {
        if (x == 0) {
            throw new RuntimeException();
        }
        else {
            a(x / 10);
        }
    }

    void challengeThree() {
        a(1215135236);
        // a
    }

    void command(SpaceMarine x) {
        if (x.corrupted) {
            throw new RuntimeException("SpaceMarine corrupted");
        }

        System.out.println(x.name);
    }

    void safeCommand(SpaceMarine x) {
        try {
            command(x);
        } catch (RuntimeException e) {
            System.out.println("Unable to command");
        }
    }

    void challengeFour() {
        SpaceMarine titus = new SpaceMarine();
        titus.corrupted = false;
        titus.name = "Demetrian Titus";

        command(titus);
        // Demetrian Titus

        SpaceMarine imurah = new SpaceMarine();
        imurah.corrupted = true;
        imurah.name = "Imurah";

        command(imurah);
        // |  Exception java.lang.RuntimeException: SpaceMarine corrupted
        // |        at command (#42:3)
        // |        at (#50:1)
    }

    void challengeFive() {
        SpaceMarine titus2 = new SpaceMarine();
        titus2.corrupted = false;
        titus2.name = "Demetrian Titus";

        command(titus2);
        // Demetrian Titus

        safeCommand(titus2);
        // Demetrian Titus

        SpaceMarine imurah2 = new SpaceMarine();
        imurah2.corrupted = true;
        imurah2.name = "Imurah";

        safeCommand(imurah2);
        // Unable to command
    }
}
