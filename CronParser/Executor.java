package CronParser;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Executor {
    
    public static void main(String[] args) {
        Map<String,List<String>> cronMap;
        Scanner scanner = new Scanner(System.in);
        
        CronParserApplication application = new CronParserApplication();
        boolean shouldContinue = true;

        while(shouldContinue) {
            String cronExpression = scanner.nextLine();

            if("exit".equalsIgnoreCase(cronExpression))
                shouldContinue = false;
            else {
                //minute hour dayOfMOnth, month, dayofWeek
                cronMap = application.parseCron(cronExpression);
                
                
                for(Map.Entry<String,List<String>> entry:cronMap.entrySet()) {
                    String key = entry.getKey();
                    List<String> values = entry.getValue();

                    System.out.print(key + ":  ");
                    for(String value:values)
                        System.out.print(value + " ");
                    System.out.println();
                }
            }
        }
        scanner.close();
    }
}
