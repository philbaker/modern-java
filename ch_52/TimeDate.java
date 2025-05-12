// Java did not originally come with java.time. At first it just had Date
// Where possible avoid using Date
import java.util.Date;
import java.time.Instant;

public class TimeDate {
    void main() {
        Date date = new Date();
        System.out.println(date);
        // Mon May 12 07:42:37 BST 2025

        // Whenever you see Date you should turn it into an Instant by calling
        // .toInstant()
        Instant instant = date.toInstant();
        System.out.println(instant);
        // 2025-05-12T06:44:24.241Z


        // You can also construct a Date from an Instant using Date.from
        // This is useful if there is some code that wants Date as an argument
        var instantNow = Instant.now();
        System.out.println(instantNow);
        // 2025-05-12T06:45:25.910295436Z

        Date dateNow = Date.from(instantNow);
        System.out.println(dateNow);
        // Mon May 12 07:45:25 BST 2025
    }
}
