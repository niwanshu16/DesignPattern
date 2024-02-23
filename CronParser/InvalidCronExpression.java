package CronParser;

public class InvalidCronExpression extends Exception {

    public InvalidCronExpression(String message) {
        super(message);
    }
}
