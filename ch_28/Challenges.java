public class Challenges {
    boolean isSorcererIf(String name) {
        return (name == "yuji" || name == "gojo");
    }

    boolean isSorcererSwitch(String name) {
        switch (name) {
            case "yuji", "gojo" -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    void challengeOne() {
        isSorcererIf("yuji");
        // true
        isSorcererIf("gojo");
        // true
        isSorcererIf("quacky");
        // false

        isSorcererSwitch("yuji");
        // true
        isSorcererSwitch("gojo");
        // true
        isSorcererSwitch("quacky");
        // false
    }

    boolean didRedSoxWin(int year) {
        switch (year) {
            case 2004, 2013 -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    void challengeTwo() {
        System.out.println(
            "2004: " + didRedSoxWin(2004)
        );
        // 2004: true

        System.out.println(
            "1998: " + didRedSoxWin(1998)
        );
        // 1998: false

        System.out.println(
            "2013: " + didRedSoxWin(2013)
        );
        // 2013: true

        System.out.println(
            "1903: " + didRedSoxWin(1903)
        );
        // 1903: false
    }

    enum StopLight {
        RED,
        YELLOW,
        GREEN
    }

    StopLight transition(StopLight current) {
        switch (current) {
            case StopLight.RED -> {
                return StopLight.GREEN;
            }

            case StopLight.GREEN -> {
                return StopLight.YELLOW;
            }

            default -> {
                return StopLight.RED;
            }
        }
    }

    void challengeThree() {
        var light = StopLight.RED;
        System.out.println(light);
        // RED

        light = transition(light);
        System.out.println(light);
        // GREEN

        light = transition(light);
        System.out.println(light);
        // YELLOW

        light = transition(light);
        System.out.println(light);
        // RED

        light = transition(light);
        System.out.println(light);
        // GREEN

        light = transition(light);
        System.out.println(light);
        // YELLOW

        light = transition(light);
        System.out.println(light);
        // RED
    }

    enum StopLight2 {
        RED,
        YELLOW,
        GREEN,
        BROKEN
    }

    StopLight2 transition2(StopLight2 current) {
        switch (current) {
            case StopLight2.RED -> {
                return StopLight2.GREEN;
            }

            case StopLight2.GREEN -> {
                return StopLight2.YELLOW;
            }

            case StopLight2.BROKEN -> {
                return StopLight2.BROKEN;
            }

            default -> {
                return StopLight2.RED;
            }
        }
    }

    void challengeFour() {
        var light = StopLight2.RED;
        System.out.println(light);
        // RED

        light = transition2(light);
        System.out.println(light);
        // GREEN

        light = transition2(light);
        System.out.println(light);
        // YELLOW

        light = transition2(light);
        System.out.println(light);
        // RED

        light = transition2(light);
        System.out.println(light);
        // GREEN

        light = transition2(light);
        System.out.println(light);
        // YELLOW

        light = transition2(light);
        System.out.println(light);
        // RED
    }

    enum Bear {
        POLAR,
        BROWN,
        BLACK,
        PANDA,
        KOALA
    }

    enum Action {
        LAY_DOWN,
        FIGHT_BACK,
        RUN_AWAY,
        YEET
    }

    Action inCaseOfBearAttackIf(Bear bear) {
        if (bear == null || bear == Bear.POLAR || bear == Bear.BLACK) {
            return Action.RUN_AWAY;
        }

        if (bear == Bear.BROWN) {
            return Action.LAY_DOWN;
        }

        if (bear == Bear.PANDA) {
            return Action.FIGHT_BACK;
        }

        return Action.YEET;
    }

    Action inCaseOfBearAttackSwitch(Bear bear) {
        if (bear == null) {
            return Action.RUN_AWAY;
        }

        switch (bear) {
            case Bear.POLAR, Bear.BLACK -> {
                return Action.RUN_AWAY;
            }
            case Bear.BROWN -> {
                return Action.LAY_DOWN;
            }
            case Bear.PANDA -> {
                return Action.FIGHT_BACK;
            }
            default -> {
                return Action.YEET;
            }
        }
    }

    void challengeFive() {
        inCaseOfBearAttackIf(Bear.POLAR);
        inCaseOfBearAttackSwitch(Bear.POLAR);
        // RUN_AWAY

        inCaseOfBearAttackIf(Bear.BROWN);
        inCaseOfBearAttackSwitch(Bear.BROWN);
        // LAY_DOWN

        inCaseOfBearAttackIf(Bear.PANDA);
        inCaseOfBearAttackSwitch(Bear.PANDA);
        // FIGHT_BACK

        inCaseOfBearAttackIf(Bear.KOALA);
        inCaseOfBearAttackSwitch(Bear.KOALA);
        // YEET

        inCaseOfBearAttackIf(null);
        inCaseOfBearAttackSwitch(null);
        // RUN_AWAY
    }
}
