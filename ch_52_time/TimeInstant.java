// java.time.Instant stores information on a particular moment in time
import java.time.Instant;

public class TimeInstant {
    void main() {
        var now = Instant.now();
        System.out.println(now);
        // 2025-05-12T06:15:31.786445628Z

        var january2nd = Instant.ofEpochMilli(86400000);
        System.out.println(january2nd);
        // 1970-01-02T00:00:00Z
    }
}
