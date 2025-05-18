import java.time.LocalDate;

public class TimeLocalDate {
    void main() {
        var jan10 = LocalDate.of(2024, 1, 10);
        System.out.println(jan10);
        // 2024-01-10

        var now = LocalDate.now();
        System.out.println(now);
        // 2025-05-12
    }
}
