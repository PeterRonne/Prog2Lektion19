package opgave03.models.loggers;

import java.time.LocalDate;
import java.time.LocalTime;

public class ConsoleLogger implements Logger, Destination {
    @Override
    public void logInfo(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
        System.out.println(logMessage);
    }

    @Override
    public void logError(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
        System.out.println(logMessage);
    }

    @Override
    public void writer(String message) {
        System.out.println();
    }
}
