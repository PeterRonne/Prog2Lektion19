package opgave03.models;
import opgave03.models.loggers.Logger;

public class WebServer {
    private Logger logger;

    public WebServer(Logger logger) {
        this.logger = logger;
    }

    public void handleRequest(String request) {
        if (request.isEmpty()) {
            logger.logError("Request is empty");
            return;
        }
        logger.logInfo("Handling request: " + request);
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
