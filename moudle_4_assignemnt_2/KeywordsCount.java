// 9/22/2025
// hong rot
// sdev200
// MODULE 4, ASSIGNMENT 2

package moudle_4_assignemnt_2;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KeywordsCount {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Java source file: ");
                String filename = input.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("The number of keywords in " + filename
            + " is " + countKeywords(file));
        }
        else {
            System.out.println("File " + filename + " does not exist");
        }

        input.close();
    }

    public static int countKeywords(File file) throws Exception {
        // array of all Java keywords
        String[] keywordString = {"abstract", "assert", "boolean",
        "break", "byte", "case", "catch", "char", "class", "const",
        "continue", "default", "do", "double", "else", "enum",
        "extends", "for", "final", "finally", "float", "goto",
        "if", "implements", "import", "instanceof", "int",
        "interface", "long", "native", "new", "package", "private",
        "protected", "public", "return", "short", "static",
        "strictfp", "super", "switch", "synchronized", "this",
        "throw", "throws", "transient", "try", "void", "volatile",
        "while", "true", "false", "null"};

        Set<String> keywordSet =
        new HashSet<>(Arrays.asList(keywordString));
        int count = 0;

        

        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            Boolean in_comment = false;
            Boolean in_string = false;

            String word = input.next();

            if (word.startsWith("//")) {
                continue;
            } else if (word.startsWith("/*")) {
                in_comment = true;
            }
        
            //excludes words in comments
            if (in_string) {
                if (word.endsWith("\"") || word.endsWith("'")) {
                    in_string = false;
                }
            } else if (word.startsWith("\"") || word.startsWith("'")) {
                in_string = true;
            }

            //counts words that are not within comment or string
            if (in_comment && word.endsWith("*/")) {
                in_comment = false;
            }
        
            //excludes words in strings
            if (!in_comment && !in_string && keywordSet.contains(word)) {
                count++;
                //System.out.println(in_comment.toString() + in_string.toString() + keywordSet.contains(word) + " " + word);
            } else {
                //System.out.println(in_comment.toString() + in_string.toString() + keywordSet.contains(word) + " - " + word.toString());
            }
        }

        input.close();

        return count;
    }
}
