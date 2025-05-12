import java.time.LocalTime;

public class TimeLocalTime {
    void main() {
        var tenTwentyFour = LocalTime.of(10, 24, 0);
        System.out.println(tenTwentyFour);
        // 10:24

        var now = LocalTime.now();
        System.out.println(now);
        // 07:28:10.098329946
    }
}
