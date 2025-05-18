import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class TimeLocalDateTime {
    void main() {
        var jan10 = LocalDate.of(2024, 1, 10);
        var tenTwentyFour = LocalTime.of(10, 24, 0);
        System.out.println(LocalDateTime.of(jan10, tenTwentyFour));
        // 2024-01-10T10:24
    }
}
