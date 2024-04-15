package opgave03;

import opgave03.models.loggers.ConsoleLogger;
import opgave03.models.WebServer;
import opgave03.models.loggers.FileLogger;

public class Opgave03 {
    public static void main(String[] args) {
        WebServer server = new WebServer(new ConsoleLogger());
        server.handleRequest("Hello World");
        server.handleRequest("");
    }
}
