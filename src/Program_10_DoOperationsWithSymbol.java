import java.util.Scanner;

/**
 * A Java program to ask user to input two numbers and their choice of operational symbol (+, -, *. /)
 * and calculate and print the subtraction, multiplication, division and addition, according to their choice of symbol
 * by using if else
 */

public class Program_10_DoOperationsWithSymbol {
    public static void main(String[] args) {
        // Declaring the scanner to accept the inputs from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The First Number : ");
        int x = scan.nextInt();
        System.out.println("Please Enter the Second NUmber : ");
        int y = scan.nextInt();
        System.out.println("Please Enter The Calculation Symbol : +, -, *, / : ");
        char symbol = scan.next().charAt(0);
        doOperationsBySelectingSymbol(x, y, symbol);
        // closing the scanner object
        scan.close();
    }

    // Performing the operation based on the symbol
    public static void doOperationsBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+')
            System.out.println(x + " + " + y + " = " + (x + y));
        else if (symbol == '-')
            System.out.println(x + " - " + y + " = " + (x - y));
        else if (symbol == '*')
            System.out.println(x + " * " + y + " = " + (x * y));
        else if (symbol == '/')
            System.out.println(x + " / " + y + " = " + (x / y));
        else
            System.out.println("Please Enter Valid Operational Symbol From +, -, *, /");


    }
}
