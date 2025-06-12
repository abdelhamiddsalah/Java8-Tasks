import java.time.*;

public class DateandTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 5, 15); // تاريخ معين

        System.out.println(today);
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfYear());

        System.out.println(today.getMonth());
        System.out.println(today.getYear());
        System.out.println("##################################################################");

        LocalTime time= LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        LocalTime tt = LocalTime.of(12,30, 10);
        System.out.println(tt.getHour());
        System.out.println("##################################################################");

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        LocalDateTime meeting = LocalDateTime.of(2025, 6, 12, 10, 0);
        System.out.println("##################################################################");

        ZonedDateTime nowInCairo = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
        System.out.println(nowInCairo);

    }
}
