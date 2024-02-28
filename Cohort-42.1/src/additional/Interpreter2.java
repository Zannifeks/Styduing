package additional;

import java.util.Scanner;

public class Interpreter2 {
    static int[] values = new int[26];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        do {
            System.out.print("# ");
            line = scanner.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
                case "print":
                    printValue(tokens[1]);
                    break;
                case "exit":
                    System.out.println("Exit from interpreter.");
                    break;
                default:
                    assignValue(line);
            }
        } while (!line.equals("exit"));
    }

    static void assignValue(String line) {
        String[] tokens = line.split("=");
        String varName = tokens[0].trim();
        // if right side from '=' is not empty
        if (tokens.length == 1) {
            System.out.println("Error: invalid command");
            return;
        }
        String varValue = tokens[1].trim();
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // transform "123" -> 123
        int value = HomeWork9Ext.calculate(HomeWork9Ext.expressionToTokens(varValue));
        //int value = Integer.valueOf(varValue);
        // assign value
        values[idx] = value;
    }

    static void printValue(String varName) {
        // check variable name
        if (!validateVarName(varName)) {
            return;
        }
        // transform 'a' -> 0
        int idx = varName.charAt(0) - 'a';
        // print value of variable
        System.out.println(values[idx]);
    }

    static boolean validateVarName(String varName) {
        // check variable name length
        if (varName.length() > 1) {
            System.out.println("Error: variable name is too long");
            return false;
        }
        if (varName.isEmpty()) {
            System.out.println("Error: variable name is empty");
            return false;
        }
        // check if variable name is in 'a'..'z'
        if (varName.charAt(0) < 'a' || varName.charAt(0) > 'z') {
            System.out.println("Error: variable name is invalid");
            return false;
        }
        return true;
    }
}
