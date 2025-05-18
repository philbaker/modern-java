import java.time.ZoneId;

public class TimeZones {
    void main() {
        ZoneId tz = ZoneId.systemDefault();

        System.out.println(tz);
        // Europe/London

        ZoneId est = ZoneId.of("US/Eastern");
        System.out.println(est);
        // US/Eastern

        System.out.println(tz.getRules());
        // ZoneRules[currentStandardOffset=Z]

        System.out.println(est.getRules());
        // ZoneRules[currentStandardOffset=-05:00]
    }
}
