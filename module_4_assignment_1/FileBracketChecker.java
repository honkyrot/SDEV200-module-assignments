// 9/22/2025
// hong rot
// sdev200
// MODULE 4, ASSIGNMENT 1

package module_4_assignment_1;

import java.util.Scanner;
import java.util.Stack;

public class FileBracketChecker {
    public static void main(String[] args) {
        String filePath = "null";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path to check: \n>");

        filePath = scanner.nextLine();
        filePath = filePath.trim();

        // open and read the file
        String file = "";

        try {
            java.io.File f = new java.io.File(filePath);
            Scanner input = new Scanner(f);

            while (input.hasNext()) {
                file += input.nextLine();
            }
            input.close();
        } catch (Exception ex) {
            System.out.println("Error reading file: " + ex.getMessage());
            System.exit(1);
        }

        FileBracketChecker checker = new FileBracketChecker();
        boolean result = checker.checkFile(file);

        if (result) {
            System.out.println("The file " + filePath + " has legal brackets.");
        } else {
            System.out.println("The file " + filePath + " does not have legal brackets.");
        }

        scanner.close();
    }

    // checks the file for brackets
    public boolean checkFile(String file) {
        Stack<Character> stack = new Stack<>();

        for (char ch : file.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // True if all brackets are matched

    } 

    // checks if the brackets are matching pairs
    private boolean isMatchingPair(char open, char close) {
        return (open == '{' && close == '}') ||
               (open == '[' && close == ']') ||
               (open == '(' && close == ')');
    }   
}