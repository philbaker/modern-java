import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.OffsetDateTime;

public class TimeOffsetDateTime {
    void main() {
        var feb14 = LocalDate.of(2025, 2, 14);
        var fiveTwentyThree = LocalTime.of(5, 23, 0);
        var est = ZoneId.of("US/Eastern");

        LocalDateTime localDateTime = LocalDateTime.of(feb14, fiveTwentyThree);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, est);
        OffsetDateTime offsetDateTime = zonedDateTime.toOffsetDateTime();

        System.out.println(offsetDateTime);
        // 2025-02-14T05:23-05:00

        var now = OffsetDateTime.now();
        System.out.println(now);
        // 2025-05-12T07:40:05.210831361+01:00

        var estNow = OffsetDateTime.now(ZoneId.of("US/Eastern"));
        System.out.println(now);
        // 2025-05-12T07:40:05.210831361+01:00
    }
}
