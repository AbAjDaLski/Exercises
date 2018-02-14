package pl.coderstrust.numbersFromFile;

import java.util.Scanner;

// The class transforms list of numbers to sum of numbers and gives result.
public class NumberProcessor {

    public String processLine(String line) {
        if (line.isEmpty()) {
            return " ";
        }
        String copy = line.trim();
        for (int i = 0; i < copy.length(); i++) {
            if (Character.isDigit(copy.charAt(i)) || Character.isWhitespace(copy.charAt(i))) {
            } else {
                return " ";
            }
        }
        StringBuilder result = new StringBuilder();
        Scanner readLine = new Scanner(copy);
        int sum = 0;
        while (readLine.hasNextInt()) {
            int number = readLine.nextInt();
            sum = sum + Integer.valueOf(number);
            result.append(number + "+");
        }
        int last = result.lastIndexOf("+");
        result.deleteCharAt(last);
        result.append("=" + sum);
        return result.toString();
    }
}
