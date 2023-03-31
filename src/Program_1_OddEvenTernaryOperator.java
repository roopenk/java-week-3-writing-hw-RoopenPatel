import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even
 * HINT : use ternary operator(? :)
 */
public class Program_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        // scanner declaration for input reading from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Number : ");
        int number = scan.nextInt();
        isItOddOrEven(number);
        // closing the scanner object
        scan.close();
    }

    // checking whether the number is odd or even
    public static void isItOddOrEven(int number) {
        // Utilization Of Ternary Operator
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " Is " + evenOrOdd + " Number");
    }
}
