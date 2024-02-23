package CronParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CronParserApplication {

    // Helper method to check if a string represents a valid integer
    private boolean isValidInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper method to get the integer value of a string
    private int getIntegerValue(String value) {
        return Integer.parseInt(value);
    }

    // Populate the Values in the range(start,end,step)
    private List<String> getValuesInRange(List<String> values,int start, int end, int step) {
        for(int val = start; val <= end; val+=step)
            values.add(Integer.toString(val));
        return values;
    }

    // Parse each part of the expression separted by the delimiter
    private int[] parsePeriod(String part, String delimiter, int minVal, int maxVal) throws InvalidCronExpression {
        String[] period = part.split(delimiter);
        int start = minVal;
        int end = maxVal;
        if (period.length != 2 || "*".equals(period[1]) || ("*".equals(period[0]) && "-".equals(delimiter))) {
            throw new InvalidCronExpression("Invalid expression " + part);
        }

        if ("-".equals(delimiter)) {
            if (!isValidInteger(period[0]) || !isValidInteger(period[1])) {
                throw new InvalidCronExpression("Invalid Cron expression " + part);
            }
            if (getIntegerValue(period[0]) >= getIntegerValue(period[1])) {
                throw new InvalidCronExpression("Invalid Cron expression: from value must be less than to value " + part);
            }
        }

        if (!"*".equals(period[0])) {
            start = getIntegerValue(period[0]);
        }
        end = getIntegerValue(period[1]);
        return new int[]{start, end};
    }
    // Parse both range and step (0-1/2 or 3/3-5)
    private int[] parseBothRangesAndStep(String part, int minVal, int maxVal) throws InvalidCronExpression {
        String[] fields = part.split("/");
        int start = minVal;
        int end = maxVal;
        int step = 0;

        if (fields[0].contains("-")) {
            if (fields[0].charAt(0) == '*') {
                fields[0] = fields[0].replace("*", Integer.toString(minVal));
            }

            int[] startAndEnd = parsePeriod(fields[0], "-", minVal, maxVal);
            start = startAndEnd[0];
            end = startAndEnd[1];

            int[] stepAndEnd = parsePeriod(part.split("-")[1], "/", minVal, maxVal);
            step = stepAndEnd[1];
        } else {
            int[] stepAndEnd = parsePeriod(fields[1], "-", minVal, maxVal);
            step = stepAndEnd[0];
            end = stepAndEnd[1];

            int[] startAnd_ = parsePeriod(part.split("-")[0], "/", minVal, maxVal);
            start = startAnd_[0];
        }

        return new int[]{start, end, step};
    }

    // Parse every field in the expression(separated by sapces)
    private List<String> parseField(String field, int minVal, int maxVal, int index) throws InvalidCronExpression {
        List<String> values = new ArrayList<>();
        
        if ("*".equals(field)) {
            values = getValuesInRange(values,minVal, maxVal,1);
        } else if ("?".equals(field)) {
            if (index != 2 && index != 4) {
                throw new InvalidCronExpression("Invalid Value [?], It can be specified only for [day_of_month or day_of_week] fields.");
            }
            return values;
        } else {
            for (String part : field.split(",")) {
                if (part.contains("?")) {
                    throw new InvalidCronExpression("Invalid cron expression " + field);
                } else if (part.contains("-") && part.contains("/")) {
                    int[] rangeAndStep = parseBothRangesAndStep(part, minVal, maxVal);
                    if(rangeAndStep[0] == -1)
                        throw new InvalidCronExpression("Invalid Cron Expression " + part);
                    values = getValuesInRange(values,rangeAndStep[0], rangeAndStep[1],rangeAndStep[2]);
                } else if (part.contains("-")) {
                    int[] range = parsePeriod(part, "-", minVal, maxVal);
                    if(range[0] == -1)
                        throw new InvalidCronExpression("Invalid Cron Expression " + part);
                    values = getValuesInRange(values,range[0], range[1],1);
                } else if (part.contains("/")) {
                    int[] startAndStep = parsePeriod(part, "/", minVal, maxVal);
                    if(startAndStep[0] == -1)
                        throw new InvalidCronExpression("Invalid Cron Expression " + part);
                    values = getValuesInRange(values,startAndStep[0], maxVal, startAndStep[1]);
                } else {
                    values.add(part);
                }
            }
        }

        for (String value : values) {
            if (Integer.parseInt(value) < minVal || Integer.parseInt(value) > maxVal) {
                throw new InvalidCronExpression("Value " + value + " is out of range [" + minVal + ", " + maxVal + "] in cron expression");
            }
        }
        return values;
    }

    // Method to parse the whole expression
    public Map<String, List<String>> parseCron(String cronExpression) {
        String[] fields = cronExpression.split("\\s+");
        int spaceCount = (int)cronExpression.chars().filter(x -> x == ' ').count();
        Map<String, List<String>> cronMap = new LinkedHashMap<>();
        try {
            if (fields.length != 6) {
                throw new InvalidCronExpression("Invalid number of fields in cron expression");
            }

            if (spaceCount != 5) {
                throw new InvalidCronExpression("Invalid Cron Expression with Extra spaces");
            }

            String minute = fields[0];
            String hour = fields[1];
            String dayOfMonth = fields[2];
            String month = fields[3];
            String dayOfWeek = fields[4];
            String command = fields[5];

            
            cronMap.put("minute", parseField(minute, 0, 59, 0));
            cronMap.put("hour", parseField(hour, 0, 23, 1));
            cronMap.put("day_of_month", parseField(dayOfMonth, 1, 31, 2));
            cronMap.put("month", parseField(month, 1, 12, 3));
            cronMap.put("day_of_week", parseField(dayOfWeek, 0, 6, 4));
            cronMap.put("command", new ArrayList<>(Arrays.asList(command))); 

            return cronMap;

        } catch(Exception e) {
            cronMap.clear();
            cronMap.put("Exception",new ArrayList<>(Arrays.asList(e.getMessage())));
        }
        
        return cronMap;
    }
}