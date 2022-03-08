import java.time.*;

public class LocalData {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Africa/Cairo");
        ZonedDateTime cairo = ZonedDateTime.now(zoneId);

        LocalDate localData = cairo.toLocalDate();
        LocalTime localTime = cairo.toLocalTime();
        LocalDateTime dateTime = cairo.toLocalDateTime();

        System.out.println(cairo);
        System.out.println(localData);
        System.out.println(localTime);
        System.out.println(dateTime);

    }
}
