class Muppet {
    final String name;
    final boolean talented;

    Muppet(String name) {
        if (name.length() == 0) {
            throw new RuntimeException("Cannot have blank name");
        }
        this.name = name;
        this.talented = true;
    }

    Muppet(String name, boolean talented) {
        if (name.length() == 0) {
            throw new RuntimeException("Cannot have blank name");
        }
        this.name = name;
        this.talented = talented;
    }
}

class Muppet2 {
    final String name;
    final boolean talented;

    Muppet2(String name) {
        // Rather than duplicate logic you can delegate to the other constructor
        this(name, false);
    }

    Muppet2(String name, boolean talented) {
        if (name.length() == 0) {
            throw new RuntimeException("Cannot have blank name");
        }
        this.name = name;
        this.talented = talented;
    }
}
