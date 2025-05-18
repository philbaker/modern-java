import java.time.Duration;
import java.time.Instant;

public class TimeDuration {
    void main() {
        var fiveMinutes = Duration.ofMinutes(5);
        System.out.println(fiveMinutes);
        // PT5M

        var twelveMilliSeconds = Duration.ofMillis(12);
        System.out.println(twelveMilliSeconds);
        // PT0.012S

        var january2nd = Instant.ofEpochMilli(86400000);
        System.out.println(january2nd);
        // 1970-01-02T00:00:00Z

        var january3rd = Instant.ofEpochMilli(86400000 * 2);
        System.out.println(january3rd);

        Duration twentyFourHours = Duration.between(january2nd, january3rd);
        System.out.println(twentyFourHours);
        // PT24H

        var january1st = Instant.ofEpochMilli(0);
        System.out.println(january1st);
        // 1970-01-01T00:00:00Z

        System.out.println(
            january1st.plus(Duration.ofHours(45))
        );
        // 1970-01-02T21:00:00Z

        System.out.println(
            january1st.minus(Duration.ofHours(1))
        );
        // 1969-12-31T23:00:00Z
    }
}
