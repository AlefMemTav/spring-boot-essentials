package springboot2.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

@Component
public class DateUtil {

    public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDataTime) {
        return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDataTime);
    }
}
