package ps12;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime time;

    public Gigasecond(LocalDate date) {
        this(LocalDateTime.of(date.getYear(), date.getMonth(), date.getDayOfMonth(), 0 , 0 , 0));
    }

    public Gigasecond(LocalDateTime dateTime) {
        this.time = dateTime;
    }

    public LocalDateTime getDateTime() {
        int giga = 1000000000;
        return time.plusSeconds(giga);
    }
}

