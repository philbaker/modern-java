public class Challenges {
    enum Response {
        YES,
        NO,
        MAYBE_SO
    }

    enum StopLight {
        RED,
        YELLOW,
        GREEN
    }

    Response goodPerformer(String name) {
        if (name == "Pitbull") {
            return Response.YES;
        }

        if (name == "Shaggy") {
            return Response.NO;
        }

        return Response.MAYBE_SO;
    }

    StopLight transition(StopLight current) {
        if (current == StopLight.RED) {
            return StopLight.GREEN;
        }

        if (current == StopLight.GREEN) {
            return StopLight.YELLOW;
        }

        return StopLight.RED;
    }

    void challengeOne() {
        System.out.println(Response.YES);
        // YES

        System.out.println(Response.NO);
        // NO

        System.out.println(Response.MAYBE_SO);
        // MAYBE_SO
    }

    void challengeTwo() {
        Response pitbull = goodPerformer("Pitbull");
        System.out.println(pitbull);
        // YES

        Response billyJoel = goodPerformer("Billy Joel");
        System.out.println(billyJoel);
        // MAYBE_SO

        Response shaggy = goodPerformer("Shaggy");
        System.out.println(shaggy);
        // NO

        Response chappelRoan = goodPerformer("Chappell Roan");
        System.out.println(chappelRoan);
        // MAYBE_SO
    }

    void challengeThree() {
        var light = StopLight.RED;
        System.out.println(light);

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
        // RED

        light = transition(light);
        System.out.println(light);
        // GREEN
    }
}

