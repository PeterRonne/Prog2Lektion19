package opgave03.models.loggers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class FileLogger implements Logger, Destination {

    File file = new File("src/opgave03/log_file");

    @Override
    public void logInfo(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][INFO] " + message;
        writer(logMessage);
    }

    @Override
    public void logError(String message) {
        String logMessage = "[" + LocalDate.now() + "][" + LocalTime.now() + "][ERROR] " + message;
        writer(logMessage);
    }

    @Override
    public void writer(String logMessage) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append(logMessage).append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
