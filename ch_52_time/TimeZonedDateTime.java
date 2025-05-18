import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonedDateTime {
    void main() {
        var jan10 = LocalDate.of(2024, 1, 10);
        var tenTwentyFour = LocalTime.of(10, 24, 0);
        var est ZoneId.of("US/Eastern");

        LocalDateTime localDateTime = LocalDateTime.of(jan10, tenTwentyFour);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, est);

        System.out.println(zonedDateTime);
        // 2024-01-10T10:24-05:00[US/Eastern]

        var now = ZonedDateTime.now();
        System.out.println(now);
        // 2025-05-12T07:36:04.694245694+01:00[Europe/London]
    }
}
