import java.util.Scanner;

/**
 * A java program to input student name, roll no and three subjects maths, science and english marks ( marks between
 * 0 and 100 and if it's out of range then print the error message "Invalid Input, marks should be between 0 and 100")
 * and find the total, percentage and result.
 * if they are pass or fail on the basis of their percentage (pass>=35) and also give them grade if % >= 80 A+,
 * % >= 60 A, % >= 50 B, % >= 35 C and then print the mark sheet in the following format:
 * ---------------------------------------
 * |                                     |
 * |             Mark Sheet              |
 * |-------------------------------------|
 * |  Name      : Jay                    |
 * |  Roll No   : 08                     |
 * |-------------------------------------|
 * |  Subjects     :  Marks              |
 * |-------------------------------------|
 * |  Maths        :  98                 |
 * |  Science      :  90                 |
 * |  English      :  85                 |
 * |-------------------------------------|
 * |  Total        :  273                |
 * |-------------------------------------|
 * |  Percentage   :  91.0               |
 * |  Result       :  Pass               |
 * |  Grade        :  A+                 |
 * |-------------------------------------|
 */

public class Program_3_MarkSheet {
    public static void main(String[] args) {
        // scanner declaration to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Student Name : ");
        String name = scan.next();
        System.out.println("Please Enter Student Roll No : ");
        int rollNum = scan.nextInt();
        System.out.println("Please Enter Maths Marks : ");
        int mathMarks = scan.nextInt();
        if (mathMarks < 0 || mathMarks > 100) {
            System.out.println("Invalid Marks, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            mathMarks = scan.nextInt();
        }
        System.out.println("Please Enter Science Marks : ");
        int scienceMarks = scan.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Marks, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            scienceMarks = scan.nextInt();
        }
        System.out.println("Please Enter English Marks : ");
        int englishMarks = scan.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Marks, Marks Should Be Between 0 And 100");
            System.out.println("Please Enter Correct Marks");
            englishMarks = scan.nextInt();
            scan.close(); // closing the scanner object
        }
        int total = sum(mathMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);
    }

    private static void printTheMarkSheet(String name, int rollNum, int mathMarks, int scienceMarks, int englishMarks, int total, int percentage, String result, String grade) {
        System.out.println(" -------------------------------------");
        System.out.println("|                                     |");
        System.out.println("|             Mark Sheet              |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Name    : " + name + "                |");
        System.out.println("|   Roll No : " + rollNum + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Subjects      :     Marks         |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Maths         : " + mathMarks + "                 |");
        System.out.println("|   Science       : " + scienceMarks + "                |");
        System.out.println("|   English       : " + englishMarks + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Total         : " + total + "             |");
        System.out.println("|-------------------------------------|");
        System.out.println("|   Percentage    : " + percentage + "              |");
        System.out.println("|   Result        : " + result + "               |");
        System.out.println("|   Grade         : " + grade + "                 |");
        System.out.println("|-------------------------------------|");
    }

    // calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // calculating the results on subjects marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        }
        return grade;
    }
}
